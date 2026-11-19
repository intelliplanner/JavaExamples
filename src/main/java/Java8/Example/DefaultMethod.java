package Java8.Example;

interface Sayable{  
    // Default method   
     default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  
/**
 * Encapsulates default method behavior for the represented example workflow.
 */
public class DefaultMethod implements Sayable{  
    /**
 * Performs the say more operation required by the represented example.
 */
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
