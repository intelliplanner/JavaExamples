package Java8.Example;

interface Test1 {
	
	/** Purpose: Adds add data. */
	void add(int a, int b);
}

/** Purpose: Encapsulates lambda expression2 behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class LambdaExpression2 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = (int a,int b)->{
			System.out.println(a+b);
		};
		t.add(10, 20);
	}

}
