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

	public List<String> list() {
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
	public boolean edit(int RuleId) {
		
		return false;

	}

	/**
	 * remove rule
	 * 
	 * @param RuleId
	 * @return
	 */
	public boolean remove(int RuleId) {
		return false;

	}

	public boolean profile() {
		return false;

	}

}
