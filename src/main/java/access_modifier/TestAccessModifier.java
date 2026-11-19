package access_modifier;

/** Purpose: Encapsulates test access modifier behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class TestAccessModifier {
	 int i=10;
}

/** Purpose: Encapsulates test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Test extends TestAccessModifier{
		
		public static void main(String args[]) {
		TestAccessModifier t=new TestAccessModifier();
		System.out.println(t.i);
	}
}