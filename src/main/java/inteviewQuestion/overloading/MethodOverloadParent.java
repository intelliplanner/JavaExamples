package inteviewQuestion.overloading;

/** Purpose: Encapsulates method overload parent behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class MethodOverloadParent {
	
	/** Purpose: Performs the test operation. */
	public void test() {
		System.out.println("Hello MethodOverloadParent test()");
	}	
		
		public static void main(String[] args) {
		MethodOverloadParent ob = new MethodOverloadParent();
		String[] str =new String[3];
		str[0]= "1";
		ob.test();
	}	
}
