package InnerClass;

/** Purpose: Encapsulates local inner class test behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class LocalInnerClassTest {
	 private int data=30;//instance variable  
	 
	 /** Purpose: Performs the display operation. */
	 void display(){  
		 int i=30;
	   
	   /** Purpose: Encapsulates local behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
	   class Local{  
	   
	   /** Purpose: Performs the msg operation. */
	   void msg(){System.out.println(data);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 	 
	 	 public static void main(String args[]){  
		 LocalInnerClassTest obj=new LocalInnerClassTest();  
		 obj.display();  
	 }  
}
