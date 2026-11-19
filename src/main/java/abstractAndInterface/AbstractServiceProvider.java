package abstractAndInterface;

/**
 * Encapsulates abstract service provider behavior for the represented example workflow.
 */
public abstract class AbstractServiceProvider implements ServiceProvider {
	/**
 * Performs the test1 operation required by the represented example.
 */
	abstract void test1();

	/**
 * Performs the test2 operation required by the represented example.
 */
	void test2() {
		System.out.println("call test2()");
	}

	@Override
	/**
 * Performs the a operation required by the represented example.
 */
	public void a() {
		System.out.println("call a()");
	}
}
