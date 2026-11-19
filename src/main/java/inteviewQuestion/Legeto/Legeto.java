package inteviewQuestion.Legeto;

/** Purpose: Encapsulates legeto behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
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

	/** Purpose: Adds insert datainto array data. */
	private static void insertDataintoArray(int n ) {
			if(size > arr.length) {
				size++;
				arr = new int[size];
			}
			arr[arr.length-1] = n;
	}

}
