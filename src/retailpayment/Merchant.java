package retailpayment;

import java.util.Date;
import java.util.List;

public class Merchant extends Person {
	int MSISDN;
	int PromoterId;
	int MerchantCode;
	
	/**
	 * get promoter list
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
	public String Profile() {
		return null;

	}

	/**
	 * register and set Merchant data
	 * 
	 * @return
	 */
	
	public boolean Register(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description,int MSISDN,int PromoterId,int MerchantCode) {
		
		return false;

	}

	/**
	 * edit Merchant profile
	 * 
	 * @return
	 */
	public boolean Edit(int userId, String nickName, String firstName, String lastName, Date lastLoginOn,
			int applicationId, String status, String registerOn, int nationalCode, int accountNo, String IBAN,
			String description,int MSISDN,int PromoterId,int MerchantCode) {
		
		
		return false;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */
	@Override
	public boolean LoginUpdate(Date date) {
		return false;

	}

}
