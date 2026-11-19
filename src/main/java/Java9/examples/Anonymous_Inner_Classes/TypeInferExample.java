package Java9.examples.Anonymous_Inner_Classes;

/** Purpose: Encapsulates abcd behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
abstract class ABCD<T>{  
    
    /** Purpose: Performs the show operation. */
    abstract T show(T a, T b);  
}  

/** Purpose: Encapsulates type infer example behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class TypeInferExample {  
        
        public static void main(String[] args) {  
        ABCD<String> a = new ABCD<String>() { // diamond operator is empty, compiler infer type  
            
            /** Purpose: Performs the show operation. */
            String show(String a, String b) {  
                return a+b;   
            }  
        };    
        String result = a.show("Java","9");  
        System.out.println(result);  
    }  
}  
