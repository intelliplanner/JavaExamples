package aaChildParentRelationExample;

/** Purpose: Encapsulates parent a behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class ParentA {
	int i = 10;
	
//	  A(){
//		System.out.println("Class A constructor");
//	}
	
	/** Purpose: Performs the test operation. */
	void test() {
		System.out.println("A test()");
	}

	/** Purpose: Performs the m1 operation. */
	void m1() {
		System.out.println("A m1()");
	}

	/** Purpose: Performs the print operation. */
	static void print() {
		System.out.println("A print()");
	}

	/** Purpose: Performs the private method operation. */
	private void privateMethod() {
		System.out.println("A privateMethod");
	}

}