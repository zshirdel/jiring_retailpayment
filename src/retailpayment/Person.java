package retailpayment;

import java.util.Date;
import java.util.List;

/**
 * Person class is abstract
 * 
 * @author z.shirdel
 *
 */
public class Person {
	int userId;
	String nickName;
	String firstName;
	String lastName;
	Date lastLoginOn;
	int applicationId;
	String status;
	String registerOn;
	int nationalCode;
	int accountNo;
	String IBAN;
	String description;

	enum Role {
		Merchant, Promoter, Buyer
	};

	public List list() {
		return null;

	}

	/**
	 * show your profile
	 * 
	 * @return
	 */
	public String Profile() {
		return null;

	}

	/**
	 * register and set your data
	 * 
	 * @return
	 */
	public boolean Register(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description) {
		
		return false;

	}

	/**
	 * edit your profile
	 * 
	 * @return
	 */
	public boolean Edit(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description) {
		
		
		return false;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */
	public boolean LoginUpdate(Date date) {
		return false;

	}

}
