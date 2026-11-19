package Java8.Example;

interface Test1 {
	/**
 * Adds add information required by the workflow.
 */
	void add(int a, int b);
}

/**
 * Encapsulates lambda expression2 behavior for the represented example workflow.
 */
public class LambdaExpression2 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = (int a,int b)->{
			System.out.println(a+b);
		};
		t.add(10, 20);
	}

}
