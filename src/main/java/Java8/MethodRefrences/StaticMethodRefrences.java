package Java8.MethodRefrences;
interface Sayable{  
    /**
 * Performs the say operation required by the represented example.
 */
    void say();  
}  
/**
 * Encapsulates static method refrences behavior for the represented example workflow.
 */
public class StaticMethodRefrences {
	
	    /**
 * Performs the say something operation required by the represented example.
 */
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
