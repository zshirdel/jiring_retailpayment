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
	 * get promoter list
	 * 
	 * @return
	 */

	public List<Promoter> list() {

		return null;
	}

	/**
	 * show your profile
	 * 
	 * @return
	 */

	public List<Promoter> profile(int prmtId) {

		return null;
	};

	/**
	 * get merchant and buyer list who attracted them
	 * 
	 * @return
	 */

	public List<Merchant> myMerchantList(int PromoterId) {

		return null;
	}

	public List<Buyer> myBuyerList(int PromoterId) {

		return null;
	}

	public boolean register(Promoter prmt) {
		this.Name = prmt.Name;
		this.nickName = prmt.nickName;
		this.nationalCode = prmt.nationalCode;
		this.accountNo = prmt.accountNo;
		this.IBAN = prmt.IBAN;
		this.description = prmt.description;
		this.MSISDN = prmt.MSISDN;
		this.Score = 0;
		this.Category = "1";
		this.RoleId = "Promoter";

		return false;

	}

	/**
	 * edit Promoter profile
	 * 
	 * @return
	 */
	public boolean edit(Promoter prmt) {
		this.Name = prmt.Name;
		this.nickName = prmt.nickName;
		this.nationalCode = prmt.nationalCode;
		this.accountNo = prmt.accountNo;
		this.IBAN = prmt.IBAN;
		this.description = prmt.description;
		this.MSISDN = prmt.MSISDN;
		this.Score = prmt.Score;
		this.Category = prmt.Category;

		return false;

	}

}
