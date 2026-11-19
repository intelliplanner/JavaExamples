package Java8.Example;

interface Sayable{  
    // Default method   
     /** Purpose: Performs the say operation. */
     default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    /** Purpose: Performs the say more operation. */
    void sayMore(String msg);  
}  

/** Purpose: Encapsulates default method behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class DefaultMethod implements Sayable{  
    
    /** Purpose: Performs the say more operation. */
    public void sayMore(String msg){        // implementing abstract method   
        System.out.println(msg);  
    }  
        
        public static void main(String[] args) {  
        DefaultMethod dm = new DefaultMethod();  
       // calling default method  
//        dm.sayMore("Work is worship");  // calling abstract method

        dm.say();
        
    }
	 
}  
