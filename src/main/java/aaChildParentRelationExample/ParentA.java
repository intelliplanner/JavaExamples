package aaChildParentRelationExample;

/**
 * Encapsulates parent a behavior for the represented example workflow.
 */
public class ParentA {
	int i = 10;
	
//	  A(){
//		System.out.println("Class A constructor");
//	}
	
	void test() {
		System.out.println("A test()");
	}

	/**
 * Performs the m1 operation required by the represented example.
 */
	void m1() {
		System.out.println("A m1()");
	}

	/**
 * Performs the print operation required by the represented example.
 */
	static void print() {
		System.out.println("A print()");
	}

	/**
 * Performs the private method operation required by the represented example.
 */
	private void privateMethod() {
		System.out.println("A privateMethod");
	}

}