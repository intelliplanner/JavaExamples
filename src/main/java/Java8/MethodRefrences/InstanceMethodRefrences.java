package Java8.MethodRefrences;

interface Sayables {
	
	/** Purpose: Performs the say operation. */
	void say();
}

interface Sayabils {
	
	/** Purpose: Performs the say operation. */
	default void say() {
		System.out.println("test");
	}
}

/** Purpose: Encapsulates instance method refrences behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class InstanceMethodRefrences implements Sayabils {

	/** Purpose: Performs the say something operation. */
	public void saySomething() {
		System.out.println("Hello, this is insctance method.");
	}

		public static void main(String[] args) {
		// Referring static method
		InstanceMethodRefrences s = new InstanceMethodRefrences();
		Sayables sayable = s::saySomething;
		sayable.say();
		Sayabils se =  new InstanceMethodRefrences();
		se.say();
	}
}
