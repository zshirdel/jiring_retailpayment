package retailpayment;

import java.util.Date;
import java.util.List;

/**
 * The person who pays
 * 
 * @author z.shirdel
 *
 */
public class Buyer extends Person {
	int MSISDN;
	int PromoterId;

	/**
	 * get merchant list
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
	public String profile() {
		return null;

	}

	/**
	 * register and set Buyer data
	 * 
	 * @return
	 */
	
	public boolean register(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description,int MSISDN,int PromoterId) {
		
		return false;

	}

	/**
	 * edit Buyer profile
	 * 
	 * @return
	 */
	public boolean edit(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description,int MSISDN,int PromoterId) {
		
		
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
