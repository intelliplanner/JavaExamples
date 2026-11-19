package data_structure.sorting;

/** Purpose: Encapsulates sorting part2 behavior; it supports data-structure processing. Owner: Virendra Gupta. */
public class SortingPart2 {
		
		public static void main(String[] args) {
		// int[] a = { 2, 7, 3, 1, 5, 4 };
		// int[] a = { 2, 7, 4, 1, 5, 3 };
		int[] a = { 7, 2, 4, 1, 5 };
		int mid =  (0 + a.length)/2;
		System.out.println("mid1: "+mid);
		 mid =  0 + (a.length - 0)/2;
		 System.out.println("mid2: "+mid);
		
		printArr(a);
		// SelectionSorting(a);
		// Bubblesort(a);
		insertionSort(a);
		// mergeSort(a);
	}

	/** Purpose: Adds insertion sort data. */
	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int hole = i;
			int value = arr[i];
			System.out.println("i:"+i+" hole:"+hole +" value:"+value);
			while (hole > 0 && arr[hole - 1] > value) {
				arr[hole] = arr[hole - 1];
				hole--;
				System.out.println("i:"+i+" hole:"+hole +" value:"+value);
			}
			arr[hole] = value;
		}
		printArr(arr);
	}

	/** Purpose: Performs the selection sorting operation. */
	private static void SelectionSorting(int[] a) {
		// int[] a = { 2, 7, 3, 1, 5, 4 };
		// In Each Iteration Small element is first
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length - 1; j++) {
				if (a[i] > a[j + 1]) { // i j 2 < 7, 2 < 3 , 2 > 1
					int temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		printArr(a);
	}

	/** Purpose: Performs the print arr operation. */
	private static void printArr(int[] a) {
		for (int m : a) {
			System.out.print(m + " ");
		}
		System.out.println();
	}

	/** Purpose: Performs the bubblesort operation. */
	private static void Bubblesort(int[] a) { // In Each Iteration highest Element in Last
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		printArr(a);
	}

}

