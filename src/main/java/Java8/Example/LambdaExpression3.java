package Java8.Example;

import java.util.ArrayList;

interface Test3 {
	
	/** Purpose: Adds add data. */
	int add(int a, int b);
}

/** Purpose: Encapsulates lambda expression3 behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class LambdaExpression3 {
		
		public static void main(String[] args) {
		Test3 t = (a, b) -> {
			return (a + b);
		};
		System.out.println(t.add(10, 20));
//------------------------------------------------------------
		Test3 t1 = (a, b) -> a + b;

		System.out.println(t1.add(20, 20));
//------------------------------------------------------------
		ArrayList<String> str = new ArrayList<String>();
		str.add("H1");
		str.add("H2");
		str.add("H3");
		str.add("H4");
		str.forEach((n)->System.out.println(n));
	}

}
