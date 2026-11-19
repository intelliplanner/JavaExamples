package aaChildParentRelationExample;

/**
 * Encapsulates child a behavior for the represented example workflow.
 */
public class ChildA extends ParentA {

//	B() {
//		this();
//		super(); // error constructor always be a first;
//	}

	int i = 20;

	/**
 * Performs the print operation required by the represented example.
 */
	void print(String s) {
		System.out.println(s);
	}

	/**
 * Performs the print operation required by the represented example.
 */
	void print(Object o) {
		System.out.println(o);
	}

	/**
 * Performs the test operation required by the represented example.
 */
	void test() {
		System.out.println("B B1");
	}

	/**
 * Performs the m1 operation required by the represented example.
 */
	void m1() {
		System.out.println("B m1");
	}

	/**
 * Performs the private method operation required by the represented example.
 */
	public void privateMethod() {
		System.out.println("B privateMethod");
	}

		public static void main(String[] args) {
		 ParentA a = new ChildA();
		 ChildA ob = new ChildA();
		 System.out.println(a.i);
		 System.out.println(ob.i);
		 a.print();
//		
		 a.m1();
		 a.test();
		//
//		 a.privateMethod();
		//
		 a.print();
//		 A ob = new A();
//		 ob.privateMethod();
		//
//		 B ob1 = new B();
//		 ob1.privateMethod();

//		 A b=null;
//		 A.print();

		// a.m2();

//		 B b = new B();
		// b.print(null);
	}

}
