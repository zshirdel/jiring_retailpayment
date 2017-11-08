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
	int FeedbackId;
	int UserId;
	Date RegisterOn;
	String Comment;

	/**
	 * add feedback
	 * 
	 * @return
	 */
	public boolean add(Feedback feedback) {
		this.FeedbackId = feedback.FeedbackId;
		this.UserId = feedback.UserId;
		this.RegisterOn = feedback.RegisterOn;
		this.Comment = feedback.Comment;

		return false;
	}

	public List<Feedback> list() {
		return null;

	}

}
