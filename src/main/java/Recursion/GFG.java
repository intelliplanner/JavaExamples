package Recursion;

/**
 * Encapsulates gfg behavior for the represented example workflow.
 */
public class GFG {
	/**
 * Performs the print fun operation required by the represented example.
 */
	static void printFun(int test) 
    { 
        if (test < 1) { 
            return; 
        }else {
			System.out.print(" "+test);
			// Statement 2
			printFun(test - 1);
			System.out.print(" "+ test);
			return;
		} 
    } 
  
        public static void main(String[] args) 
    { 
        int test = 3; 
        printFun(test); 
    } 
}
