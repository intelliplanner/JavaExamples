package InnerClass;

/** Purpose: Encapsulates local inner2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class localInner2{  
	 private int data=30;//instance variable  
	 
	 /** Purpose: Performs the display operation. */
	 void display(){  
	   final int value=50;//local variable must be final till jdk 1.7 only  
	  
	  /** Purpose: Encapsulates local behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
	  class Local{  
	   
	   /** Purpose: Performs the msg operation. */
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
