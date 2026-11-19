package a.basic_program;

/** Purpose: Encapsulates instance block test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class InstanceBlockTest {
	int speed;
	{
		speed = 10;
		System.out.println("Instance Block call");
	}
	static{
		System.out.println("static Block call");
	}

	/** Purpose: Creates a instance block test instance. */
	InstanceBlockTest() {
		System.out.println("contructor Block call, speed:" + speed);
	}

		public static void main(String[] args) {
		System.out.println("main method");
		new InstanceBlockTest();
	}

}
