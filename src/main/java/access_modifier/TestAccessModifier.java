package access_modifier;

/**
 * Encapsulates test access modifier behavior for the represented example workflow.
 */
class TestAccessModifier {
	 int i=10;
}
/**
 * Encapsulates test behavior for the represented example workflow.
 */
class Test extends TestAccessModifier{
		public static void main(String args[]) {
		TestAccessModifier t=new TestAccessModifier();
		System.out.println(t.i);
	}
}