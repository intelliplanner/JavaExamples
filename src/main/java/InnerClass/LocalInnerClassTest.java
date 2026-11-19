package InnerClass;

/**
 * Encapsulates local inner class test behavior for the represented example workflow.
 */
public class LocalInnerClassTest {
	 private int data=30;//instance variable  
	 /**
 * Performs the display operation required by the represented example.
 */
	 void display(){  
		 int i=30;
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
		 LocalInnerClassTest obj=new LocalInnerClassTest();  
		 obj.display();  
	 }  
}
