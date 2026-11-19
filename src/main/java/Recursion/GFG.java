package Recursion;

/** Purpose: Encapsulates gfg behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class GFG {
	
	/** Purpose: Performs the print fun operation. */
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
