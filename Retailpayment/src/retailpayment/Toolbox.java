package retailpayment;

import com.google.gson.Gson;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.UnsupportedEncodingException;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Toolbox class provides the tools
 * 
 * @author z.shirdel
 *
 */
public class Toolbox {
	public static int g_days_in_month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static int j_days_in_month[] = { 31, 31, 31, 31, 31, 31, 30, 30, 30, 30, 30, 29 };

	// ****************************************************************//
	// private static variables
	// ****************************************************************//
	private static double len = 365.24219879;
	private static double base = 2346;

	private static double greg_len = 365.2425;
	private static double greg_origin_from_jalali_base = 629964;
	private static String greg_month_names[] = { "", "Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "A ug", "Sep",
			"Oct", "Nov", "Dec" };

	private int _year;
	private int _month;
	private int _dayOfMonth;
	private int _hour;
	private int _minute;
	private int _second;

	private Calendar _gregorianCalendar;

	private boolean _leap;

	/** convert object to Json */
	public String toJson(Object obj) {
		Gson gson = new Gson();
		// convert java object to JSON format
		String json = gson.toJson(obj);
		return json;
	}

	/************************************************************************
	 * convertToGregorian method get Jalalli date object and return Gregorian
	 * date string;
	 */
	public String convertToGregorian(Date date) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		return getGregorianCalendar(year, month, day);

	}

	/**
	 * convertToGregorian method get Jalalli date string and return Gregorian
	 * date string;
	 */
	public String convertToGregorian(String dateString) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = null;
		try {
			date = dateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return convertToGregorian(date);
	}

	/** This function performs the conversion of Jalali to Gregorian; */
	public String getGregorianCalendar(int year, int month, int day) {
		String date_gregorian = null;
		int gy, gm, gd;
		int jy, jm, jd;
		long g_day_no, j_day_no;
		boolean leap;

		int i;

		jy = year - 979;
		jm = month - 1;
		jd = day - 1;

		j_day_no = 365 * jy + (jy / 33) * 8 + (jy % 33 + 3) / 4;
		for (i = 0; i < jm; ++i)
			j_day_no += j_days_in_month[i];

		j_day_no += jd;

		g_day_no = j_day_no + 79;

		gy = (int) (1600 + 400 * (g_day_no
				/ 146097)); /*
							 * 146097 = 365*400 + 400/4 - 400/100 + 400/400
							 */
		g_day_no = g_day_no % 146097;

		leap = true;
		if (g_day_no >= 36525) /* 36525 = 365*100 + 100/4 */
		{
			g_day_no--;
			gy += 100 * (g_day_no
					/ 36524); /* 36524 = 365*100 + 100/4 - 100/100 */
			g_day_no = g_day_no % 36524;

			if (g_day_no >= 365)
				g_day_no++;
			else
				leap = false;
		}

		gy += 4 * (g_day_no / 1461); /* 1461 = 365*4 + 4/4 */
		g_day_no %= 1461;

		if (g_day_no >= 366) {
			leap = false;

			g_day_no--;
			gy += g_day_no / 365;
			g_day_no = g_day_no % 365;
		}

		for (i = 0; g_day_no >= g_days_in_month[i] + parsBooleanToInt(i == 1 && leap); i++)
			g_day_no -= g_days_in_month[i] + parsBooleanToInt(i == 1 && leap);

		gm = i + 1;
		gd = (int) (g_day_no + 1);

		Date date = new GregorianCalendar(gy, gm, gd).getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		date_gregorian = dateFormat.format(date);
		return date_gregorian;
	}

	private static int parsBooleanToInt(Boolean sample) {
		if (sample)
			return 1;
		else
			return 0;
	}

	/**************************************************************************
	 * Converts specified gregorian date to persian date in form of (yyyy/mm/dd)
	 */
	public static String getPersianDate(int gregYear, int gregMonth, int gregDay) {
		// passed days from Greg orig
		double d = Math.ceil((gregYear - 1) * greg_len);
		// passed days from jalali base
		double d_j = d + greg_origin_from_jalali_base + getGregDayOfYear(gregYear, gregMonth, gregDay);

		// first result! jalali year
		double j_y = Math.ceil(d_j / len) - 2346;
		// day of the year
		double j_days_of_year = Math.floor(((d_j / len) - Math.floor(d_j / len)) * 365) + 1;

		// System.out.println(j_days_of_year);
		StringBuffer result = new StringBuffer();

		result.append((int) j_y + "/" + (int) month(j_days_of_year) + "/" + (int) dayOfMonth(j_days_of_year));
		return result.toString();
	}

	private static double getGregDayOfYear(double year, double month, double day) {
		int greg_moneths_len[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean leap = false;
		if (((year % 4) == 0) && (((year % 400) != 0)))
			leap = true;
		if (leap)
			greg_moneths_len[2] = 29;
		int sum = 0;
		for (int i = 0; i < month; i++)
			sum += greg_moneths_len[i];
		return sum + day - 2;
	}

	private static double month(double day) {

		if (day < 6 * 31)
			return Math.ceil(day / 31);
		else
			return Math.ceil((day - 6 * 31) / 30) + 6;
	}

	private static double dayOfMonth(double day) {

		double m = month(day);
		if (m <= 6)
			return day - 31 * (m - 1);
		else
			return day - (6 * 31) - (m - 7) * 30;
	}

	/**
	 * Converts specified gregorian date to persian date in form of (yyyy/mm/dd)
	 */
	public static String getPersianDate(Date d) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		int year = gc.get(Calendar.YEAR);
		return getPersianDate(year, (gc.get(Calendar.MONTH)) + 1, gc.get(Calendar.DAY_OF_MONTH));
	}
	
	
	/***********************************************************************
	 * Encode method;
	 */

}
