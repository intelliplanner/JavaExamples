package inteviewQuestion.GlobalLogic;

/** Purpose: Encapsulates parent b behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
class ParentB {
	
	/** Purpose: Performs the test operation. */
	public void test(int m) {
		System.out.println("Parent test() ");
		System.out.println("Parent test() ");
	}

}

/** Purpose: Encapsulates child b behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
class ChildB extends ParentB {

	/** Purpose: Performs the test operation. */
	public void test(int... m) {
		System.out.println("Child test() ");
		System.out.println("Child test() ");
	}
	
	/** Purpose: Performs the test operation. */
	public void test(double... m) {
		System.out.println("Child test() ");
		System.out.println("Child test() ");
	}
}

/** Purpose: Encapsulates global logic example2 behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class GlobalLogicExample2 {
		
		public static void main(String args[]) {

		ChildB ob1 = new ChildB();
		ob1.test(10,20);
//		ParentB ob2 = new ChildB();
//		ob2.test(20,30);
		
		ParentB ob4 = new ChildB();
//		ob4.test(20,30);
		
		ParentB ob3 = new ParentB();
		ob3.test(30);

	}
}
