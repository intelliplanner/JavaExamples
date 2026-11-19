package InnerClass;

/** Purpose: Encapsulates member inner behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class MemberInner {
		 private int data=30;
		 static int d=10;
		 
		 /** Purpose: Encapsulates inner behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
		 class Inner{
		 static final int i = 2;	 
		  
		  /** Purpose: Performs the msg operation. */
		  void msg(){System.out.println("data is "+data + d);}  
		 }  
		 		 
		 		 public static void main(String args[]){  
			 MemberInner obj=new MemberInner();  
			 MemberInner.Inner in=obj.new Inner();  
			 in.msg();
			 System.out.println(MemberInner.Inner.i);
		 }  
}
