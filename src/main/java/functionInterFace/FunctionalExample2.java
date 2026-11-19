package functionInterFace;

/** Purpose: Encapsulates functional example2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class FunctionalExample2 {

		public static void main(String[] args) {
		FunctionInter f1 = new FunctionInter() {

			@Override
			
			/** Purpose: Performs the functional interface operation. */
			public void functionalInterface() {
				System.out.println("1. Functional Interface Call");
			}
		};
		f1.functionalInterface();

		System.out.println("============================================");

		FunctionInter f2 = () -> {
			System.out.println("2. Functional Interface Call");
		};

		f2.functionalInterface();

		System.out.println("============================================");
		
		Runnable r = new Runnable() {
			
			@Override
			
			/** Purpose: Executes the run workflow. */
			public void run() {
				System.out.println("Runnable...r1");
			}
		};
		
		Thread t1= new Thread(r);
		t1.start();

		Runnable r2 = ()->{
			System.out.println("============================================");
				System.out.println("Runnable...r2");
		};
		
		Thread t2= new Thread(r2);
		t2.start();

	}

}
