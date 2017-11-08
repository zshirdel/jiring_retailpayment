package retailpayment;

import java.util.Date;
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
	 * get promoter list
	 * 
	 * @return
	 */
	@Override
	public List<String> list() {

		return null;

	}

	/**
	 * show your profile
	 * 
	 * @return
	 */
	public List<String> profile(int merchId) {

		return null;
	};

	/**
	 * register and set Merchant data
	 * 
	 * @return
	 */

	public boolean register(Merchant merch) {
		super.firstName = merch.firstName;
		super.lastName = merch.lastName;
		super.nickName = merch.nickName;
		super.nationalCode = merch.nationalCode;
		super.accountNo = merch.accountNo;
		super.IBAN = merch.IBAN;
		super.description = merch.description;
		this.MSISDN = merch.MSISDN;
		this.merchantCode = merch.merchantCode;
		this.promoterId = merch.promoterId;
		//RoleType.Merchant;

		return false;

	}

	/**
	 * edit Merchant profile
	 * 
	 * @return
	 */
	public boolean edit(Merchant merch) {
		super.firstName = merch.firstName;
		super.lastName = merch.lastName;
		super.nickName = merch.nickName;
		super.nationalCode = merch.nationalCode;
		super.accountNo = merch.accountNo;
		super.IBAN = merch.IBAN;
		super.description = merch.description;
		this.MSISDN = merch.MSISDN;
		this.merchantCode = merch.merchantCode;

		return false;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */
	@Override
	public boolean loginUpdate(int merchId) {
		return false;

	}

}
