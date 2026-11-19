package Java8.Java8Example;

interface Test {
//	void t();
	 /** Purpose: Performs the say operation. */
	 public String say(String name);  
}

/** Purpose: Encapsulates lamda expression behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class LamdaExpression {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test d = ()->{
//			System.out.println("Test Successfully");
//		};
//		d.t();
		Test d2 = (name) -> {
			return "Hello "+ name;
		};
		System.out.println(d2.say("Vicky"));
	}
}
