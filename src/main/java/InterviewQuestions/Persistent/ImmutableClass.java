package InterviewQuestions.Persistent;

import java.util.Date;

/** Purpose: Encapsulates immutable class behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
final class ImmutableClass {
	private final String name;
	private final int id;
	private final Date date;
	
	/** Purpose: Creates a immutable class instance. */
	private ImmutableClass(String name, int id,Date date) {
		this.name = name;
		this.id = id;
		this.date= new Date(date.getTime());
	}

	/** Purpose: Retrieves get immutable class object data. */
	public ImmutableClass  getImmutableClassObject(String name, int id,Date date) {
		return new ImmutableClass( name,  id, date);
	}

	/** Purpose: Retrieves get date data. */
	public Date getDate() {
		return new Date(date.getTime());
	}

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Retrieves get id data. */
	public int getId() {
		return id;
	}

}
