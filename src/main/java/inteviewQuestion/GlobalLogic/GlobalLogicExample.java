package inteviewQuestion.GlobalLogic;

//Vararg methods Override/Overload confusion

/** Purpose: Encapsulates parent behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
class Parent {
	int i = 10;
	
	/** Purpose: Performs the test operation. */
	public void test(int m) {
		System.out.println("Parent test() m: " +m);
		System.out.println("Parent test() i: " +i);
	}
}

/** Purpose: Encapsulates global logic example behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class GlobalLogicExample extends Parent {
	int i = 20;
//	public void test(int m) {
//		System.out.println("child test() m: " +m);
//		System.out.println("child test() i: " +i);
//	}
//	
	/** Purpose: Performs the test operation. */
	public void test(int... m) {
		System.out.println("child varags test() m: " +m);
		System.out.println("child varags test() i: " +i);
	}

		public static void main(String[] args) {
		GlobalLogicExample o1 = new GlobalLogicExample();
		o1.test(30,20);
	
		Parent o2 = new GlobalLogicExample();
		o2.test(40);
		
		System.out.println(o2.i);
	}
}
