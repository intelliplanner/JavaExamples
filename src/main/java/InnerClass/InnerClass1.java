package InnerClass;

/**
 * Encapsulates inner class1 behavior for the represented example workflow.
 */
public class InnerClass1{// Local Inner Class Example
 private int data=30;//instance variable
 /**
 * Performs the display operation required by the represented example.
 */
 void display(){
  /**
 * Encapsulates local behavior for the represented example workflow.
 */
  class Local{
   /**
 * Performs the msg operation required by the represented example.
 */
   void msg(){System.out.println(data);}
  }
  Local l=new Local();
  l.msg();
 }
  public static void main(String args[]){
	 InnerClass1 obj=new InnerClass1();
     obj.display();
 }
}
