package DefaultMethods;

/**
 * Encapsulates operationa behavior for the represented example workflow.
 */
class Operationa {
	int data = 50;

	/**
 * Performs the change operation required by the represented example.
 */
	void change(int data) {
		data = data + 100;// changes will be in the local variable only
		
//		this.data = data + 100;
	}

	
	
		public static void main(String args[]) {
		Operationa op = new Operationa();

		System.out.println("before change " + op.data);
		op.change(500);
		System.out.println("after change " + op.data);

	}
}
