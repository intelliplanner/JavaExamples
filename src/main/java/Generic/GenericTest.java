package Generic;

/** Purpose: Encapsulates generic test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class GenericTest {
	
	/** Purpose: Performs the test operation. */
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
