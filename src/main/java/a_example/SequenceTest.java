package a_example;

/**
 * Encapsulates sequence test behavior for the represented example workflow.
 */
public class SequenceTest {
	static {
		// System.out.print("A ");
		System.out.println("Inside Static Block.");
//		System.exit(1);
	}

	{
		System.out.println("Inside Init Block. ");
	}

	/**
 * Creates a configured sequence test instance for the represented workflow.
 */
	SequenceTest() {
		System.out.println("Inside Constructor Block. ");
	}

		public static void main(String[] args) {
		System.out.println("Inside Main Block. ");
		new SequenceTest().go();
	}

	/**
 * Performs the go operation required by the represented example.
 */
	private void go() {
		System.out.print("Inside Go Block.");
	}

}
