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
	int promoterId;

	/**
	 * get merchant list
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
	public List<String> profile(int buyerId) {

		return null;
	};

	/**
	 * register and set Buyer data
	 * 
	 * @return
	 */

	public boolean register(Buyer buyer) {
		super.firstName = buyer.firstName;
		super.lastName = buyer.lastName;
		super.nickName = buyer.nickName;
		super.nationalCode = buyer.nationalCode;
		super.accountNo = buyer.accountNo;
		super.IBAN = buyer.IBAN;
		super.description = buyer.description;
		this.MSISDN = buyer.MSISDN;
		this.promoterId = buyer.promoterId;

		return false;

	}

	/**
	 * edit Buyer profile
	 * 
	 * @return
	 */
	public boolean edit(Buyer buyer) {
		super.firstName = buyer.firstName;
		super.lastName = buyer.lastName;
		super.nickName = buyer.nickName;
		super.nationalCode = buyer.nationalCode;
		super.accountNo = buyer.accountNo;
		super.IBAN = buyer.IBAN;
		super.description = buyer.description;
		this.MSISDN = buyer.MSISDN;

		return false;

	}

	/**
	 * last log in in app
	 * 
	 * @param date
	 * @return
	 */
	@Override
	public boolean loginUpdate(int buyerId) {
		return false;

	}

}
