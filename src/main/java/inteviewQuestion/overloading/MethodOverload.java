package inteviewQuestion.overloading;

/** Purpose: Encapsulates method overload behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class MethodOverload extends MethodOverloadParent {
	
	/** Purpose: Performs the test operation. */
	public void test() {
		System.out.println("Hello MethodOverload test()");
	}	
		
		public static void main(String[] args) {
		MethodOverloadParent ob = new MethodOverload();
		ob.test();
	}
}
