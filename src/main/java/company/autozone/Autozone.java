package company.autozone;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/** Purpose: Encapsulates autozone behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Autozone {
//	Given an integer array nums, return the number of 
//			subarrays
//			of length 3 such that the sum of the first and third numbers equals exactly half of the second number.
//			 
//			Input: nums = [1,2,1,4,1]
//			Output: 1
//			 
	
	public static void main(String[] args) {
		
		test();
		int[] arr = {1,2,1,4,1};  
		
		int tot = 3;
		int newArr[] = {}; 
		
		int i = 0;
		int count = 0;
		
		int len = arr.length;
		
//		while(i<len) {
		for (int j = 0; j < arr.length; j++) {
			
			if(j+1 > arr.length-1 || j+2 > arr.length-1)
				return ;
			
			int t = arr[j] + arr[j+2];
		    if(t*2 == arr[j+1] ) {
					++count;
					System.out.println("value: " + arr[j] + ", "+ arr[j+1] + ", "+arr[j+2] + +count);
			}
			System.out.println("count: " +count);
		}

		
	}

/** Purpose: Performs the test operation. */
private static void test() {
	List<String> li = Arrays.asList("Virendra","Vicky","Virendra","Sanu");
	
//	li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()).;	
}

}
