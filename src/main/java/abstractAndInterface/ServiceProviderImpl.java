package abstractAndInterface;

/** Purpose: Encapsulates service provider impl behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class ServiceProviderImpl extends AbstractServiceProvider {

	@Override
	
	/** Purpose: Performs the test1 operation. */
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
	
	/** Purpose: Performs the b operation. */
	public void b() {
	}

	@Override
	
	/** Purpose: Performs the c operation. */
	public void c() {
	}

	@Override
	
	/** Purpose: Performs the d operation. */
	public void d() {
		// TODO Auto-generated method stub
		
	}

}
