package JavaAnnotations;

/** Purpose: Encapsulates test annotation1 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class TestAnnotation1{  

/** Purpose: Performs the eat something operation. */
void eatSomething(){System.out.println("eating something");}

}  

/** Purpose: Encapsulates dog behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Dog extends TestAnnotation1{  
@Override  

/** Purpose: Performs the eat something operation. */
void eatSomething(){System.out.println("eating foods");}//should be eatSomething  
}  

/** Purpose: Encapsulates animals behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Animals{  

public static void main(String args[]){  
	TestAnnotation1 a=new Dog();
a.eatSomething();
}}  