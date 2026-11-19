package Java9.examples.Anonymous_Inner_Classes;

/**
 * Encapsulates abcd behavior for the represented example workflow.
 */
abstract class ABCD<T>{  
    /**
 * Performs the show operation required by the represented example.
 */
    abstract T show(T a, T b);  
}  
/**
 * Encapsulates type infer example behavior for the represented example workflow.
 */
public class TypeInferExample {  
        public static void main(String[] args) {  
        ABCD<String> a = new ABCD<String>() { // diamond operator is empty, compiler infer type  
            /**
 * Performs the show operation required by the represented example.
 */
            String show(String a, String b) {  
                return a+b;   
            }  
        };    
        String result = a.show("Java","9");  
        System.out.println(result);  
    }  
}  
