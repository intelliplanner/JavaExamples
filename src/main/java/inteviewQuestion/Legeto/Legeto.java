package inteviewQuestion.Legeto;

/**
 * Encapsulates legeto behavior for the represented coding problem.
 */
public class Legeto {
	static int size = 2;
	static int[] arr = new int[size];
		public static void main(String[] args) {
		insertDataintoArray(2);
		insertDataintoArray(22);
		insertDataintoArray(23);
		insertDataintoArray(24);
		insertDataintoArray(25);
		insertDataintoArray(26);
		insertDataintoArray(27);
		insertDataintoArray(28);
		insertDataintoArray(29);
	}

	/**
 * Adds insert datainto array information required by the workflow.
 */
	private static void insertDataintoArray(int n ) {
			if(size > arr.length) {
				size++;
				arr = new int[size];
			}
			arr[arr.length-1] = n;
	}

}
