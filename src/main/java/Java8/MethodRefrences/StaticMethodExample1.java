package Java8.MethodRefrences;

import java.util.function.BiFunction;

interface Arithmetic{
	 
	 /** Purpose: Adds add data. */
	 void add(int a,int b);
}

interface operation{
	 
	 /** Purpose: Performs the multi operation. */
	 int multi(int a,int b);
}

interface operationP{
	 
	 /** Purpose: Performs the multi operation. */
	 int multi(int a,int b);
	 
	 /** Purpose: Performs the test operation. */
	 static int test() {
		return 0;
	}
}

/** Purpose: Encapsulates static method example1 behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class StaticMethodExample1 {
	
	/** Purpose: Adds add refrence data. */
	public static void addRefrence(int a,int b) {
		System.out.println(a+b);
	}

	/** Purpose: Performs the multi ref operation. */
	public static int multiRef(int a,int b) {
		return a*b;
	}

		public static void main(String[] args) {
		Arithmetic a = StaticMethodExample1::addRefrence;
		a.add(10, 20);
		
		BiFunction<Integer, Integer, Integer> b =  StaticMethodExample1::multiRef;
		System.out.println(b.apply(20, 30));
	}

}
