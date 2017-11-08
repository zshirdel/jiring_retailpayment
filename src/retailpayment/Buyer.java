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
	
	public List<Buyer> list() {

		return null;

	}

	/**
	 * show your profile
	 * 
	 * @return
	 */
	
	public List<Buyer> profile(int buyerId) {

		return null;
	};

	/**
	 * register and set Buyer data
	 * 
	 * @return
	 */

	public boolean register(Buyer buyer) {
		this.Name = buyer.Name;
		this.nickName = buyer.nickName;
		this.nationalCode = buyer.nationalCode;
		this.accountNo = buyer.accountNo;
		this.IBAN = buyer.IBAN;
		this.description = buyer.description;
		this.MSISDN = buyer.MSISDN;
		this.promoterId = buyer.promoterId;
		this.RoleId="Buyer";

		return false;

	}

	/**
	 * edit Buyer profile
	 * 
	 * @return
	 */
	public boolean edit(Buyer buyer) {
		this.Name = buyer.Name;
		this.nickName = buyer.nickName;
		this.nationalCode = buyer.nationalCode;
		this.accountNo = buyer.accountNo;
		this.IBAN = buyer.IBAN;
		this.description = buyer.description;
		this.MSISDN = buyer.MSISDN;
		
		return false;

	}

	

}
