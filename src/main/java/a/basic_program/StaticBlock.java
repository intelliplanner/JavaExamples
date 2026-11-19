package a.basic_program;

/**
 * Encapsulates static block behavior for the represented example workflow.
 */
public class StaticBlock {
	static {
		System.out.println("static block is invoked");
		// System.exit(0);
		test();
	}

	/**
 * Performs the test operation required by the represented example.
 */
	public static void test() {
		System.out.println("test()");
	}

		public static void main(String[] args) {

		new StaticBlock();
		try {
			System.out.println("try block call");

			return;
		} finally {
			System.out.println("finally");
		}

	}

}
