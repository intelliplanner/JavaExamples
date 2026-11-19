package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Encapsulates find sum behavior for the represented coding problem.
 */
public class FindSum {
//	Given an array of integers and a sum, find the number of pairs whose sum is equal to the given sum. Example: 
//	Input: array = {1, 5, 7, -1}, sum = 6 Output: 2

	public static void main(String[] args) {
		int sum = 6;
		int count = 0;
		
//		int arr [] =   {1, 5, 7, -1};
		List<Integer> arr = Arrays.asList(1,5,7,-1);
//		Collections.sort(arr); // {-1,1,5,7}
//		int i = 0;
//		int s = arr.size()-1;
//		int n = s/2;
//		while(i <= n) {
//			for (int j = n+1; j < s;j++) {//3 2 
//				System.out.println("i="+i + "j="+j +"           "+  arr.get(i) + ", "+arr.get(j) + ", Sum= "+(arr.get(i)+arr.get(j)));
//				if(arr.get(i) + arr.get(j) == sum) {
//					System.out.println(arr.get(i) + ", "+arr.get(j));
//					count++;
//					return;
//				}
//				else if(arr.get(i) + arr.get(j) < sum) {
//					i++;
//				}
////				else {
////					j++;
////				}
//				
//			}
//		}
//		System.out.println("output Count:"+count );

//		arr.stream().reduce(6, o ->( o1+o2 == 6)).collect(Collectors.toMap(z));//
		
		
		
		
	}

}
