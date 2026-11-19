package a_example;

/** Purpose: Encapsulates override main behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class OverrideMain {
		
		public static void main(String[] args) {
		System.out.println("parent class main method");
	}
}

/** Purpose: Encapsulates parent behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Parent extends OverrideMain {
		
		public static void main(String[] args) {
		System.out.println("child class main method");
	}
}
