package Java8.MethodRefrences;
interface Sayable{  
    
    /** Purpose: Performs the say operation. */
    void say();  
}  

/** Purpose: Encapsulates static method refrences behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class StaticMethodRefrences {

	    /** Purpose: Performs the say something operation. */
	    public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    	    
	    	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = StaticMethodRefrences::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	    }  
	
}
