package Java8.Example;

interface Sayables {
	/**
 * Performs the say operation required by the represented example.
 */
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);

	// static method
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

/**
 * Encapsulates default static interface java8 behavior for the represented example workflow.
 */
public class DefaultStaticInterfaceJava8 implements Sayables {

	/**
 * Performs the say more operation required by the represented example.
 */
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	/**
 * Performs the say louder operation required by the represented example.
 */
	static void sayLouder(String msg) {
		System.out.println("DefaultStaticInterfaceJava8: "+msg);
	}
		public static void main(String[] args) {
		DefaultStaticInterfaceJava8 dm = new DefaultStaticInterfaceJava8();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method
		sayLouder("Helloooo..."); // calling static method
		Sayables.sayLouder("Helloooooooo");
	}
}
