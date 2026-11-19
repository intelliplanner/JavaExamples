package JavaAnnotations;

/**
 * Encapsulates test annotation1 behavior for the represented example workflow.
 */
class TestAnnotation1{  
/**
 * Performs the eat something operation required by the represented example.
 */
void eatSomething(){System.out.println("eating something");}

}  
  
/**
 * Encapsulates dog behavior for the represented example workflow.
 */
class Dog extends TestAnnotation1{  
@Override  
/**
 * Performs the eat something operation required by the represented example.
 */
void eatSomething(){System.out.println("eating foods");}//should be eatSomething  
}  
  
/**
 * Encapsulates animals behavior for the represented example workflow.
 */
class Animals{  
public static void main(String args[]){  
	TestAnnotation1 a=new Dog();
a.eatSomething();
}}  