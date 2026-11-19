package InnerClass;

interface Test{
	/**
 * Performs the display operation required by the represented example.
 */
	void display();
}
/**
 * Encapsulates anonymous inner behavior for the represented example workflow.
 */
public class AnonymousInner {
	
		public static void main(String... args) {
		Test t = new Test() {
			
			@Override
			/**
 * Performs the display operation required by the represented example.
 */
			public void display() {
				System.out.println("Annonymous Call");
			}
		};
		t.display();
	}
}
