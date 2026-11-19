package inteviewQuestion.GlobalLogic;

import java.util.Arrays;

/** Purpose: Encapsulates find valuesof sum equals behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class FindValuesofSumEquals {
		
		public static void main(String[] args) {
		int total = 5;// 6  9  ,7
		FindValuesofSumEqualss(total);
	}

	/** Purpose: Retrieves find valuesof sum equalss data. */
	private static void FindValuesofSumEqualss(int total) {
		int[] arr = { 9, 2, 3, 7, -1,6, 3, 1, 4 };
//		int[] arr =  {1, 5, 7, -1};
		Arrays.sort(arr);
		int l = arr.length - 1;
		int i = 0;
		while (i < l) {
			//System.out.println(arr[i] + arr[l]);
			if (arr[i] + arr[l] == total) {
				System.out.println(arr[i] + " " + arr[l] + " : " + (arr[i] + arr[l]));
				i++;
				l--;
			} else if (arr[i] + arr[l] < total) {
				i++;
			} else {
				l--;
			}
		}

	}
}
