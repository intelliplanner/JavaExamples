package abstractAndInterface.test_hierarchy;

interface Test1 {
	
	/** Purpose: Performs the a operation. */
	void a();

	/** Purpose: Performs the b operation. */
	void b();

	/** Purpose: Performs the c operation. */
	void c();

	/** Purpose: Performs the d operation. */
	void d();
}

/** Purpose: Encapsulates a behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
abstract class A implements Test1 {

	/** Purpose: Performs the test operation. */
	abstract void test();
	
	@Override
	
	/** Purpose: Performs the a operation. */
	public void a() {
		System.out.println("class A call a()");
	}
	
}

/** Purpose: Encapsulates test2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Test2 extends A {

//	@Override
//	public void a() {
//		System.out.println("class Test2 call a()");
//	}
	@Override
	
	/** Purpose: Performs the b operation. */
	public void b() {
		System.out.println("class Test2 call b()");
	}

	@Override
	
	/** Purpose: Performs the c operation. */
	public void c() {
		System.out.println("class Test2 call c()");
	}

	@Override
	
	/** Purpose: Performs the d operation. */
	public void d() {
		System.out.println("class Test2 call d()");
	}

	@Override
	
	/** Purpose: Performs the test operation. */
	void test() {
		// TODO Auto-generated method stub
		
	}
}

/** Purpose: Encapsulates test5 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Test5 {
		
		public static void main(String args[]) {
		Test2 t = new Test2();
		t.a();
		t.b();
		t.c();
		t.d();
	}
}
