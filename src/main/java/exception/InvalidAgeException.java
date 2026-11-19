package exception;

/** Purpose: Encapsulates invalid age exception behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class InvalidAgeException  extends Exception  
{  
    
    /** Purpose: Creates a invalid age exception instance. */
    public InvalidAgeException (String str)  
    {  
        // calling the constructor of parent Exception  
        super(str);  
    }  
}  
    