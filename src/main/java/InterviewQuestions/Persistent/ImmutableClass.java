package InterviewQuestions.Persistent;

import java.util.Date;

/**
 * Encapsulates immutable class behavior for the represented coding problem.
 */
final class ImmutableClass {
	private final String name;
	private final int id;
	private final Date date;
	/**
 * Creates a configured immutable class instance for the represented workflow.
 */
	private ImmutableClass(String name, int id,Date date) {
		this.name = name;
		this.id = id;
		this.date= new Date(date.getTime());
	}

	/**
 * Retrieves or locates get immutable class object data needed for decision-making.
 */
	public ImmutableClass  getImmutableClassObject(String name, int id,Date date) {
		return new ImmutableClass( name,  id, date);
	}
	
	/**
 * Retrieves or locates get date data needed for decision-making.
 */
	public Date getDate() {
		return new Date(date.getTime());
	}

	/**
 * Retrieves or locates get name data needed for decision-making.
 */
	public String getName() {
		return name;
	}

	/**
 * Retrieves or locates get id data needed for decision-making.
 */
	public int getId() {
		return id;
	}

}
