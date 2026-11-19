package Java8.Example;

/**
 * Encapsulates abstract class behavior for the represented example workflow.
 */
abstract class AbstractClass {
	
	/**
 * Creates a configured abstract class instance for the represented workflow.
 */
	public AbstractClass() { // constructor
		System.out.println("You can create constructor in abstract class");
	}

	/**
 * Adds add information required by the workflow.
 */
	abstract int add(int a, int b); // abstract method

	/**
 * Performs the sub operation required by the represented example.
 */
	int sub(int a, int b) { // non-abstract method
		return a - b;
	}

	/**
 * Performs the multiply operation required by the represented example.
 */
	static int multiply(int a, int b) { // static method
		return a * b;
	}
}

/**
 * Encapsulates abstract vs interface behavior for the represented example workflow.
 */
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
