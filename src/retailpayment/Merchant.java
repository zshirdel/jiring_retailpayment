package retailpayment;

import java.util.Date;
import java.util.List;

/**
 * Who receives money
 * 
 * @author z.shirdel
 *
 */
public class Merchant extends Person {
	int MSISDN;
	int PromoterId;
	int MerchantCode;

	/**
	 * get promoter list
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
	 * register and set Merchant data
	 * 
	 * @return
	 */

	public boolean register(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description, int MSISDN, int PromoterId, int MerchantCode) {

		return false;

	}

	/**
	 * edit Merchant profile
	 * 
	 * @return
	 */
	public boolean edit(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description, int MSISDN, int PromoterId, int MerchantCode) {

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
