package exception;

/**
 * Encapsulates invalid age exception behavior for the represented example workflow.
 */
class InvalidAgeException  extends Exception  
{  
    /**
 * Creates a configured invalid age exception instance for the represented workflow.
 */
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    