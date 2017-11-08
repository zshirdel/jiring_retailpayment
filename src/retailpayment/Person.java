package retailpayment;

import java.util.Date;
import java.util.List;

/**
 * Person class override by merchant,promoter and buyer classes
 * 
 * @author z.shirdel
 * @since 1396/8/16
 * @category Actors
 */
public class Person {
	int userId;
	String nickName;
	String firstName;
	String lastName;
	Date lastLoginOn;
	Date registerOn;
	String nationalCode;
	String accountNo;
	String IBAN;
	String description;

	enum StatusType {
		Active, Deactive, Blocked, Notconfirmed
	};

	enum RoleType {
		Merchant, Promoter, Buyer
	};

	public List<String> list() {
		return null;
	};

	public List<String> profile(int userId) {
		return null;
	};

	public boolean register(Person prsn) {
		return false;
	};

	public boolean edit(Person prsn) {
		return false;
	};

	public boolean loginUpdate(int personid) {
		return false;
	};
}
