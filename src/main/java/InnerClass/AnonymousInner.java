package InnerClass;

interface Test{
	
	/** Purpose: Performs the display operation. */
	void display();
}

/** Purpose: Encapsulates anonymous inner behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class AnonymousInner {

		public static void main(String... args) {
		Test t = new Test() {
			
			@Override
			
			/** Purpose: Performs the display operation. */
			public void display() {
				System.out.println("Annonymous Call");
			}
		};
		t.display();
	}
}
