package abstractAndInterface;

/** Purpose: Encapsulates abstract service provider behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public abstract class AbstractServiceProvider implements ServiceProvider {
	
	/** Purpose: Performs the test1 operation. */
	abstract void test1();

	/** Purpose: Performs the test2 operation. */
	void test2() {
		System.out.println("call test2()");
	}

	@Override
	
	/** Purpose: Performs the a operation. */
	public void a() {
		System.out.println("call a()");
	}
}
