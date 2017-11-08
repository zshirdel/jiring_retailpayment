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
	public List<String> list() {

		return null;

	}

	/**
	 * show your profile
	 * 
	 * @return
	 */
	@Override
	public List<String> profile(int poroId) {

		return null;
	};

	/**
	 * register and set Promoter data
	 * 
	 * @return
	 */

	public boolean register(Promoter poro) {
		super.firstName = poro.firstName;
		super.lastName = poro.lastName;
		super.nickName = poro.nickName;
		super.nationalCode = poro.nationalCode;
		super.accountNo = poro.accountNo;
		super.IBAN = poro.IBAN;
		super.description = poro.description;
		this.MSISDN = poro.MSISDN;
		this.Score = 0;
		this.Category = "1";
		// RoleType.Merchant;
		Date date = new Date();
		super.registerOn = date;

		return false;

	}

	/**
	 * edit Promoter profile
	 * 
	 * @return
	 */
	public boolean edit(Promoter poro) {
		super.firstName = poro.firstName;
		super.lastName = poro.lastName;
		super.nickName = poro.nickName;
		super.nationalCode = poro.nationalCode;
		super.accountNo = poro.accountNo;
		super.IBAN = poro.IBAN;
		super.description = poro.description;
		this.MSISDN = poro.MSISDN;
		this.Score = poro.Score;
		this.Category = poro.Category;
		// RoleType.Merchant;

		return false;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */
	@Override
	public boolean loginUpdate(int poroId) {
		Date date = new Date();
		super.lastLoginOn = date;
		
		return false;

	}

}
