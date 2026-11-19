package Java8.Example;

interface Sayables {
	
	/** Purpose: Performs the say operation. */
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	/** Purpose: Performs the say more operation. */
	void sayMore(String msg);

	// static method
	/** Purpose: Performs the say louder operation. */
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

/** Purpose: Encapsulates default static interface java8 behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class DefaultStaticInterfaceJava8 implements Sayables {

	/** Purpose: Performs the say more operation. */
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	/** Purpose: Performs the say louder operation. */
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
