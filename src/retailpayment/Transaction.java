package retailpayment;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * pay money
 * 
 * @author z.shirdel
 *
 */
public class Transaction {
	int TransactionId;
	Date RegisterOn;
	int BuyerId;
	int MerchantID;
	float Amount;
	int MSISDN;
	int ConfirmCode;
	int ApplicationId;

	enum PaymentType {
	};

	enum PaymentInterface {
	};

	/**
	 * Pay method change money in databases
	 * 
	 * @param BuyerId
	 * @param MerchantID
	 * @param Amount
	 * @return
	 */
	public boolean Pay(int BuyerId, int MerchantID, float Amount) {
		return false;

	}

	/**
	 * get last report for
	 * 
	 * @return
	 */
	public String Brief(int MSISDN) {
		return null;

	}

	/**
	 * clear reports
	 * 
	 * @return
	 */
	public boolean Clear() {
		return false;

	}

	public boolean Archive() {
		return false;

	}

	/**
	 * get reports from date1 till date2
	 * 
	 * @param from
	 * @param till
	 * @return
	 */
	public List<String> Turnover(Date from, Date till) {
		return null;

	}

	/**
	 * get random code
	 * 
	 * @return
	 */
	public int ConfirmGen() {
		Random rand = new Random();
		// rand.nextInt((max - min) + 1) + min;
		int random = rand.nextInt((999999 - 100000) + 1) + 100000;
		ConfirmCode = random;

		return random;

	}

}
