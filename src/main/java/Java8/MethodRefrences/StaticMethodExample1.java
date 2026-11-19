package Java8.MethodRefrences;

import java.util.function.BiFunction;

interface Arithmetic{
	 /**
 * Adds add information required by the workflow.
 */
	 void add(int a,int b);
}

interface operation{
	 /**
 * Performs the multi operation required by the represented example.
 */
	 int multi(int a,int b);
}

interface operationP{
	 /**
 * Performs the multi operation required by the represented example.
 */
	 int multi(int a,int b);
	 /**
 * Performs the test operation required by the represented example.
 */
	 static int test() {
		return 0;
	}
}


/**
 * Encapsulates static method example1 behavior for the represented example workflow.
 */
public class StaticMethodExample1 {
	/**
 * Adds add refrence information required by the workflow.
 */
	public static void addRefrence(int a,int b) {
		System.out.println(a+b);
	}
	
	/**
 * Performs the multi ref operation required by the represented example.
 */
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
