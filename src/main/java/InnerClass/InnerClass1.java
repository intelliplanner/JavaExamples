package InnerClass;

/** Purpose: Encapsulates inner class1 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class InnerClass1{// Local Inner Class Example
 private int data=30;//instance variable
 
 /** Purpose: Performs the display operation. */
 void display(){
  
  /** Purpose: Encapsulates local behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
  class Local{
   
   /** Purpose: Performs the msg operation. */
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
