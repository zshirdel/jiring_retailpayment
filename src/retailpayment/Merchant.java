package retailpayment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * person Who receives money
 * 
 * @author z.shirdel
 *
 */
public class Merchant extends Person {
	int MSISDN;
	int promoterId;
	int merchantCode;

	/**
	 * get merchant list
	 * 
	 * @return
	 */

	public List<Merchant> list() {

		return null;

	}

	/**
	 * get buyer list for every merchants
	 * 
	 * @param PromoterId
	 * @return
	 */

	public List<Buyer> myBuyerList(int merchantId) {

		return null;
	}

	/**
	 * show your profile
	 * 
	 * @return
	 */

	public List<Merchant> profile(int merchId) {

		return null;
	};

	/**
	 * register and set Merchant data
	 * 
	 * @return
	 */

	public boolean register(Merchant merch) {

		this.Name = merch.Name;
		this.nickName = merch.nickName;
		this.nationalCode = merch.nationalCode;
		this.accountNo = merch.accountNo;
		this.IBAN = merch.IBAN;
		this.description = merch.description;
		this.MSISDN = merch.MSISDN;
		this.merchantCode = merch.merchantCode;
		this.promoterId = merch.promoterId;
		this.RoleId = "Merchant";
		return false;
	}

	/**
	 * edit Merchant profile
	 * 
	 * @return
	 */
	public boolean edit(Merchant merch) {
		this.Name = merch.Name;
		this.nickName = merch.nickName;
		this.nationalCode = merch.nationalCode;
		this.accountNo = merch.accountNo;
		this.IBAN = merch.IBAN;
		this.description = merch.description;
		this.MSISDN = merch.MSISDN;
		this.merchantCode = merch.merchantCode;
		return true;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */

}
