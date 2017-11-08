package retailpayment;

import java.util.Date;
import java.util.List;

/**
 * get feedback from users
 * 
 * @author z.shirdel
 *
 */
public class Feedback {
	int feedbackId;
	int userId;
	Date registerOn;
	String comment;

	/**
	 * add feedback
	 * 
	 * @return
	 */
	public boolean add(Feedback feedback) {
		this.feedbackId = feedback.feedbackId;
		this.userId = feedback.userId;
		this.comment = feedback.comment;
		Date date = new Date();
		this.registerOn = date;

		return false;
	}

	public List<Feedback> list() {
		return null;

	}

}
