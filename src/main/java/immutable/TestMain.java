package immutable;

import java.util.Date;

/** Purpose: Encapsulates test main behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class TestMain {
		
		public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(100, "test", new Date());
		System.out.println(im);
		Integer immutableField1 = im.getImmutableField1();
		immutableField1=10000;
		String immutableField2 = im.getImmutableField2();
		immutableField2="Text Changed";
		
		Date mutableField = im.getMutableField();
		mutableField.setTime(new Date().getTime());
//		tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField());
//		System.out.println(im);
		System.out.println(mutableField);

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