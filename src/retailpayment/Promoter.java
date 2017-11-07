package retailpayment;

import java.util.Date;
import java.util.List;

/**
 * System marketer who attracts receivers
 * 
 * @author z.shirdel
 *
 */
public class Promoter extends Person {
	int MSISDN;
	String Category;
	int Score;

	/**
	 * get merchant and buyer list who attracted them
	 * 
	 * @return
	 */
	@Override
	public List list() {

		return null;

	}

	/**
	 * show your profile
	 * 
	 * @return
	 */
	@Override
	public List<String> profile(int userId) {
		return null;

	}

	/**
	 * register and set Promoter data
	 * 
	 * @return
	 */

	public boolean register(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description, int MSISDN, String Category, int Score) {

		return false;

	}

	/**
	 * edit Promoter profile
	 * 
	 * @return
	 */
	public boolean edit(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description, int MSISDN, String Category, int Score) {

		return false;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */
	@Override
	public boolean loginUpdate(Date date) {
		return false;

	}

}
