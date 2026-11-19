package misc;

/** Purpose: Encapsulates java main behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class JavaMain {
		
		public static void main(String args[]) {
		func1("a1","a2","a3");
		func2(new String[] {"b1","b2","b3"});
	}

	/** Purpose: Performs the func1 operation. */
	private static void func1(String... str) {
		for(String s:str) 
			System.out.println(s);
	}
	
	/** Purpose: Performs the func2 operation. */
	private static void func2(String[] str) {
		for(String s:str) 
			System.out.println(s);
	}
}
