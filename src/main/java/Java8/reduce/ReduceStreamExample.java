package Java8.reduce;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Encapsulates reduce stream example behavior for the represented example workflow.
 */
public class ReduceStreamExample {

		public static void main(String[] args) {
		reduce1();
		reduce2();
		reduce3();
		findDuplicate1();
		findDuplicate2();
	}

	/**
 * Retrieves or locates find duplicate1 data needed for decision-making.
 */
	private static void findDuplicate1() {
		List<String> list = Arrays.asList("Geeks","GFG", "Geeks", "GeeksQuiz","for", "GeeksQuiz", "GeeksforGeeks");
		HashSet<String> set = new HashSet<>();
		Set<String> s =  list.stream().filter(n-> !set.add(n)).collect(Collectors.toSet());
		// Set.add() returns false if the element was already in the set.
		System.out.println(s); 
		
		
	}

	/**
 * Retrieves or locates find duplicate2 data needed for decision-making.
 */
	private static void findDuplicate2() {
		List<String> list = Arrays.asList("Geeks","GFG", "Geeks", "GeeksQuiz","for", "GeeksQuiz", "GeeksforGeeks");
		Set<String> s = list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
		System.out.println(s);
		
		
	}

	/**
 * Performs the reduce3 operation required by the represented example.
 */
	private static void reduce3() {
		// TODO Auto-generated method stub

	}

	/**
 * Performs the reduce2 operation required by the represented example.
 */
	private static void reduce2() {
		// TODO Auto-generated method stub

	}

	/**
 * Performs the reduce1 operation required by the represented example.
 */
	private static void reduce1() {
		// TODO Auto-generated method stub

	}

}
