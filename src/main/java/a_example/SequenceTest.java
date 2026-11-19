package a_example;

/** Purpose: Encapsulates sequence test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class SequenceTest {
	static {
		// System.out.print("A ");
		System.out.println("Inside Static Block.");
//		System.exit(1);
	}

	{
		System.out.println("Inside Init Block. ");
	}

	/** Purpose: Creates a sequence test instance. */
	SequenceTest() {
		System.out.println("Inside Constructor Block. ");
	}

		public static void main(String[] args) {
		System.out.println("Inside Main Block. ");
		new SequenceTest().go();
	}

	/** Purpose: Performs the go operation. */
	private void go() {
		System.out.print("Inside Go Block.");
	}

}
