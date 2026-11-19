package email;

import java.util.Date;

import javax.mail.Message;
import javax.mail.search.SearchTerm;

/**
 * Encapsulates sent date search term behavior for the represented example workflow.
 */
public class SentDateSearchTerm extends SearchTerm {

	/**
	 * Virendra Gupta
	 */
	private static final long serialVersionUID = 1L;
	Date receivedDate;

	/**
 * Creates a configured sent date search term instance for the represented workflow.
 */
	public SentDateSearchTerm(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	@Override
	/**
 * Performs the match operation required by the represented example.
 */
	public boolean match(Message message) {
		try {
			if ( message.getSentDate().after(receivedDate)) {
//				if (message.getSubject().contains("Job") /*&& message.getSentDate().after(receivedDate)*/) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}