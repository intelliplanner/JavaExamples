package a.immutable_class;

import java.util.Date;

/** Purpose: Encapsulates immutable class behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public final class ImmutableClass {
	private final Integer immutableField1;

	private final String immutableField2;

	private final Date mutableField;

	/** Purpose: Creates a immutable class instance. */
	private ImmutableClass(Integer fld1, String fld2, Date date) {
		this.immutableField1 = fld1;
		this.immutableField2 = fld2;
		this.mutableField = new Date(date.getTime());
	}

	/** Purpose: Performs the create new instance operation. */
	public static ImmutableClass createNewInstance(Integer fld1, String fld2, Date date) {
		return new ImmutableClass(fld1, fld2, date);
	}

	// Provide no setter methods

	/** Purpose: Retrieves get immutable field1 data. */
	public Integer getImmutableField1() {
		return immutableField1;
	}

	/** Purpose: Retrieves get immutable field2 data. */
	public String getImmutableField2() {
		return immutableField2;
	}

	/** Purpose: Retrieves get mutable field data. */
	public Date getMutableField() {
		return new Date(mutableField.getTime());
	}

//	@Override
//	public String toString() {
//		return immutableField1 + " - " + immutableField2 + " - " + mutableField;
//	}

	@Override
	
	/** Purpose: Provides a readable object representation. */
	public String toString() {
		return "ImmutableClass{" +
				"immutableField1=" + immutableField1 +
				", immutableField2='" + immutableField2 + '\'' +
				", mutableField=" + mutableField +
				'}';
	}
}
