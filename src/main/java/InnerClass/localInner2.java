package InnerClass;

/**
 * Encapsulates local inner2 behavior for the represented example workflow.
 */
public class localInner2{  
	 private int data=30;//instance variable  
	 /**
 * Performs the display operation required by the represented example.
 */
	 void display(){  
	   final int value=50;//local variable must be final till jdk 1.7 only  
	  /**
 * Encapsulates local behavior for the represented example workflow.
 */
	  class Local{  
	   /**
 * Performs the msg operation required by the represented example.
 */
	   void msg(){System.out.println(value);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 	 public static void main(String args[]){  
	  localInner2 obj=new localInner2();  
	  obj.display();  
	 }  
	} 
