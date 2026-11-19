package Java8.MethodRefrences;

interface Sayables {
	/**
 * Performs the say operation required by the represented example.
 */
	void say();
}


interface Sayabils {
	/**
 * Performs the say operation required by the represented example.
 */
	default void say() {
		System.out.println("test");
	}
}
/**
 * Encapsulates instance method refrences behavior for the represented example workflow.
 */
public class InstanceMethodRefrences implements Sayabils {

	/**
 * Performs the say something operation required by the represented example.
 */
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
