package aaChildParentRelationExample;

/** Purpose: Encapsulates child a behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class ChildA extends ParentA {

//	B() {
//		this();
//		super(); // error constructor always be a first;
//	}

	int i = 20;

	/** Purpose: Performs the print operation. */
	void print(String s) {
		System.out.println(s);
	}

	/** Purpose: Performs the print operation. */
	void print(Object o) {
		System.out.println(o);
	}

	/** Purpose: Performs the test operation. */
	void test() {
		System.out.println("B B1");
	}

	/** Purpose: Performs the m1 operation. */
	void m1() {
		System.out.println("B m1");
	}

	/** Purpose: Performs the private method operation. */
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
