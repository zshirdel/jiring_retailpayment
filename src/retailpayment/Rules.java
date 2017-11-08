package retailpayment;

import java.util.List;

/**
 * User Rules
 * 
 * @author z.shirdel
 *
 */
public class Rules {
	int ruleId;
	int userId;
	String title;
	String value;
	String Name;
	String RoleId;

	public List<Rules> list() {
		return null;

	}

	public List<Rules> myRuleslist(int userId) {
		return null;

	}

	/**
	 * add rule
	 * 
	 * @return
	 */
	public boolean add(Rules rule) {
		this.ruleId = rule.ruleId;
		this.userId = rule.userId;
		this.title = rule.title;
		this.value = rule.value;

		return false;

	}

	/**
	 * edit rule
	 * 
	 * @param RuleId
	 * @return
	 */
	public boolean edit(Rules rls) {
		this.title = rls.title;
		this.value = rls.value;

		return false;

	}

	/**
	 * remove rule
	 * 
	 * @param RuleId
	 * @return
	 */
	public boolean remove(int ruleId) {
		return false;

	}

	public boolean profile(int ruleId) {
		return false;

	}

}
