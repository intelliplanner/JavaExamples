package inteviewQuestion.GlobalLogic;

/**
 * Encapsulates parent b behavior for the represented coding problem.
 */
class ParentB {
	/**
 * Performs the test operation required by the represented example.
 */
	public void test(int m) {
		System.out.println("Parent test() ");
		System.out.println("Parent test() ");
	}

	
}

/**
 * Encapsulates child b behavior for the represented coding problem.
 */
class ChildB extends ParentB {

	/**
 * Performs the test operation required by the represented example.
 */
	public void test(int... m) {
		System.out.println("Child test() ");
		System.out.println("Child test() ");
	}
	/**
 * Performs the test operation required by the represented example.
 */
	public void test(double... m) {
		System.out.println("Child test() ");
		System.out.println("Child test() ");
	}
}

/**
 * Encapsulates global logic example2 behavior for the represented coding problem.
 */
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
