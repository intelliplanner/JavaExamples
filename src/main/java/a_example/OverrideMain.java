package a_example;

/**
 * Encapsulates override main behavior for the represented example workflow.
 */
public class OverrideMain {
		public static void main(String[] args) {
		System.out.println("parent class main method");
	}
}

/**
 * Encapsulates parent behavior for the represented example workflow.
 */
class Parent extends OverrideMain {
		public static void main(String[] args) {
		System.out.println("child class main method");
	}
}
