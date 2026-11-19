package immutable;

import java.util.Date;

/** Purpose: Encapsulates test immutable2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class TestImmutable2 {

		public static void main(String[] args) {
		MutableClass2 mc2 = new MutableClass2();
		mc2.setName("Vicky");
		ImmutbleClass2 im =new  ImmutbleClass2(mc2);
		System.out.println("before: "+im);
		mc2.setName("test");
		System.out.println("after: "+im);
		
	}

	/** Purpose: Performs the try modification operation. */
	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
		
	}
}
// class Test extends ImmutableClass{
// final class cannot be extends to in subclass
// }