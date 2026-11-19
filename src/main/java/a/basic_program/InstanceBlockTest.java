package a.basic_program;

/**
 * Encapsulates instance block test behavior for the represented example workflow.
 */
public class InstanceBlockTest {
	int speed;
	{
		speed = 10;
		System.out.println("Instance Block call");
	}
	static{
		System.out.println("static Block call");
	}

	/**
 * Creates a configured instance block test instance for the represented workflow.
 */
	InstanceBlockTest() {
		System.out.println("contructor Block call, speed:" + speed);
	}

		public static void main(String[] args) {
		System.out.println("main method");
		new InstanceBlockTest();
	}

}
