package misc;

/**
 * Encapsulates java main behavior for the represented example workflow.
 */
public class JavaMain {
		public static void main(String args[]) {
		func1("a1","a2","a3");
		func2(new String[] {"b1","b2","b3"});
	}

	/**
 * Performs the func1 operation required by the represented example.
 */
	private static void func1(String... str) {
		for(String s:str) 
			System.out.println(s);
	}
	/**
 * Performs the func2 operation required by the represented example.
 */
	private static void func2(String[] str) {
		for(String s:str) 
			System.out.println(s);
	}
}
