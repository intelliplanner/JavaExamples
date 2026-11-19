package a.immutable_class;

import java.util.Date;

/**
 * Encapsulates immutable class behavior for the represented example workflow.
 */
public final class ImmutableClass {
	private final Integer immutableField1;

	/**
	 * String class is immutable as it also does not provide setter to change its
	 * content
	 */
	private final String immutableField2;

	/**
	 * Date class is mutable as it provide setters to change various date/time parts
	 */
	private final Date mutableField;

	/**
 * Creates a configured immutable class instance for the represented workflow.
 */
	private ImmutableClass(Integer fld1, String fld2, Date date) {
		this.immutableField1 = fld1;
		this.immutableField2 = fld2;
		this.mutableField = new Date(date.getTime());
	}

	/**
 * Performs the create new instance operation required by the represented example.
 */
	public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date) {
		return new ImmutableClass(fld1, fld2, date);
	}

	// Provide no setter methods

	/**
	 * Integer class is immutable so we can return the instance variable as it is
	 */
	public Integer getImmutableField1() {
		return immutableField1;
	}

	/**
	 * String class is also immutable so we can return the instance variable as it
	 * is
	 */
	public String getImmutableField2() {
		return immutableField2;
	}

	/**
	 * Date class is mutable so we need a little care here. We should not return the
	 * reference of original instance variable. Instead a new Date object, with
	 * content copied to it, should be returned.
	 */
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

//	@Override
//	public String toString() {
//		return immutableField1 + " - " + immutableField2 + " - " + mutableField;
//	}


	@Override
	/**
 * Provides a readable representation for reporting or diagnostics.
 */
	public String toString() {
		return "ImmutableClass{" +
				"immutableField1=" + immutableField1 +
				", immutableField2='" + immutableField2 + '\'' +
				", mutableField=" + mutableField +
				'}';
	}
}
