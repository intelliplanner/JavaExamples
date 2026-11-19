package email;

import java.util.Date;

import javax.mail.Message;
import javax.mail.search.SearchTerm;

/** Purpose: Encapsulates sent date search term behavior; it handles email search and filtering. Owner: Virendra Gupta. */
public class SentDateSearchTerm extends SearchTerm {

	private static final long serialVersionUID = 1L;
	Date receivedDate;

	/** Purpose: Creates a sent date search term instance. */
	public SentDateSearchTerm(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	@Override
	/** Purpose: Performs the match operation. */
	public boolean match(Message message) {
		try {
			if ( message.getSentDate().after(receivedDate)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}