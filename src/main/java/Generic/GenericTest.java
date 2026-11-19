package Generic;

/**
 * Encapsulates generic test behavior for the represented example workflow.
 */
public class GenericTest {
	/**
 * Performs the test operation required by the represented example.
 */
	public static <E> void test(E[] a) {
		for(E o:a)
			System.out.println(o);
	}
		public static void main(String args[]) {
		Integer[] i= {1,2,3,4,5};
		String[] s= {"test","test1"};
		GenericTest.test(i);
		GenericTest.test(s);
	}
}
