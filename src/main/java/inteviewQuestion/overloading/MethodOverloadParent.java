package inteviewQuestion.overloading;

/**
 * Encapsulates method overload parent behavior for the represented coding problem.
 */
public class MethodOverloadParent {
	/**
 * Performs the test operation required by the represented example.
 */
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
