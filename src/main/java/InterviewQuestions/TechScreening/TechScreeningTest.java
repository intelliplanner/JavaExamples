package InterviewQuestions.TechScreening;

import java.util.*;  
import java.util.stream.Collectors;  
/**
 * Encapsulates product behavior for the represented coding problem.
 */
class Product{  
    int id;  
    String name;  
    Integer price;  
    /**
 * Creates a configured product instance for the represented workflow.
 */
    public Product(int id, String name, Integer price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
/**
 * Encapsulates tech screening test behavior for the represented coding problem.
 */
public class TechScreeningTest {  
        public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000));  
        productsList.add(new Product(2,"Dell Laptop",30000));  
        productsList.add(new Product(3,"Lenevo Laptop",28000));  
        productsList.add(new Product(4,"Sony Laptop",28000));  
        productsList.add(new Product(5,"Apple Laptop",90000));  
        List<Integer> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)
                                     .collect(Collectors.toList()); // collecting as list  
      
        System.out.println(productPriceList2);
    }  
}  