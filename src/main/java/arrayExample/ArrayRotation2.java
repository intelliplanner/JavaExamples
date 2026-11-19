package arrayExample;

/**
 * Encapsulates array rotation2 behavior for the represented example workflow.
 */
public class ArrayRotation2 {
	
	
	/**
 * Performs the rotate left operation required by the represented example.
 */
	static void rotateLeft(int[] arr,int key) {
		int arrSize=arr.length;
		if(arr[arrSize-1] == key) {
			System.out.println("Rotated Array: "+ arr);
			return;
		}
		int m[]= {};
		for (int i = 0; i < arr.length; i++) {
			 m[i+1] = arr[i];  
		}
		arr = m;
		rotateLeft(arr, key);
	}
	/**
 * Performs the rotate right operation required by the represented example.
 */
	static void rotateRight(int[] arr,int key) {
		
	}
	
		public static void main(String ars[]) {
		int arr[]= {1,2,3,4,5,6};
		rotateLeft(arr, 2);
	}
}
