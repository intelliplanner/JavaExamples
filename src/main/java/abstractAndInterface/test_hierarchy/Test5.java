package abstractAndInterface.test_hierarchy;

interface Test1 {
	/**
 * Performs the a operation required by the represented example.
 */
	void a();

	/**
 * Performs the b operation required by the represented example.
 */
	void b();

	/**
 * Performs the c operation required by the represented example.
 */
	void c();

	/**
 * Performs the d operation required by the represented example.
 */
	void d();
}

/**
 * Encapsulates a behavior for the represented example workflow.
 */
abstract class A implements Test1 {
	
	/**
 * Performs the test operation required by the represented example.
 */
	abstract void test();
	
	@Override
	/**
 * Performs the a operation required by the represented example.
 */
	public void a() {
		System.out.println("class A call a()");
	}
	
}

/**
 * Encapsulates test2 behavior for the represented example workflow.
 */
class Test2 extends A {

//	@Override
//	public void a() {
//		System.out.println("class Test2 call a()");
//	}
	@Override
	/**
 * Performs the b operation required by the represented example.
 */
	public void b() {
		System.out.println("class Test2 call b()");
	}

	@Override
	/**
 * Performs the c operation required by the represented example.
 */
	public void c() {
		System.out.println("class Test2 call c()");
	}

	@Override
	/**
 * Performs the d operation required by the represented example.
 */
	public void d() {
		System.out.println("class Test2 call d()");
	}

	@Override
	/**
 * Performs the test operation required by the represented example.
 */
	void test() {
		// TODO Auto-generated method stub
		
	}
}

/**
 * Encapsulates test5 behavior for the represented example workflow.
 */
public class Test5 {
		public static void main(String args[]) {
		Test2 t = new Test2();
		t.a();
		t.b();
		t.c();
		t.d();
	}
}
