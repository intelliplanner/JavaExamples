package Java8.Example;

/** Purpose: Encapsulates abstract class behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
abstract class AbstractClass {

	/** Purpose: Creates a abstract class instance. */
	public AbstractClass() { // constructor
		System.out.println("You can create constructor in abstract class");
	}

	/** Purpose: Adds add data. */
	abstract int add(int a, int b); // abstract method

	/** Purpose: Performs the sub operation. */
	int sub(int a, int b) { // non-abstract method
		return a - b;
	}

	/** Purpose: Performs the multiply operation. */
	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

/** Purpose: Encapsulates abstract vs interface behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class AbstractVsInterface extends AbstractClass {
/*	
	public AbstractVsInterface(int i){
		//super(i);
	}*/
	public int add(int a, int b) { // implementing abstract method
		return a + b;
	}

		public static void main(String[] args) {
		AbstractVsInterface a = new AbstractVsInterface();
		/*int result1 = a.add(20, 10); // calling abstract method
		int result2 = a.sub(20, 10); // calling non-abstract method
		int result3 = AbstractClass.multiply(20, 10); // calling static method
		System.out.println("Addition: " + result1);
		System.out.println("Substraction: " + result2);
		System.out.println("Multiplication: " + result3);
*/	}
}
