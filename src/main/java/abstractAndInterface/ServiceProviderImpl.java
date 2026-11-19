package abstractAndInterface;

/**
 * Encapsulates service provider impl behavior for the represented example workflow.
 */
public class ServiceProviderImpl extends AbstractServiceProvider {

	@Override
	/**
 * Performs the test1 operation required by the represented example.
 */
	void test1() {
		System.out.println("call test1");
	}

		public static void main(String s[]) {
		System.out.println("call mains");
		ServiceProviderImpl obj = new ServiceProviderImpl();
		obj.test1();
		obj.test2();
	}

	@Override
	/**
 * Performs the b operation required by the represented example.
 */
	public void b() {
	}

	@Override
	/**
 * Performs the c operation required by the represented example.
 */
	public void c() {
	}

	@Override
	/**
 * Performs the d operation required by the represented example.
 */
	public void d() {
		// TODO Auto-generated method stub
		
	}


}
