package a_example;

public class SequenceTest {
	static {
		// System.out.print("A ");
		System.out.println("Inside Static Block.");
//		System.exit(1);
	}

	{
		System.out.println("Inside Init Block. ");
	}

	SequenceTest() {
		System.out.println("Inside Constructor Block. ");
	}

	public static void main(String[] args) {
		System.out.println("Inside Main Block. ");
		new SequenceTest().go();
	}

	private void go() {
		System.out.print("Inside Go Block.");
	}

}
