package collection.stack;

import java.util.*;

/** Purpose: Encapsulates stack example behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class StackExample {
		
		public static void main(String args[]) {
		
//		checkByQueue("[]()[]"); //FIFO
		QueueTest();
	}

	/** Purpose: Performs the stack test operation. */
	private static void stackTest() {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		
		System.out.println(stack);
//stack.pop();  

		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("===============================");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

	/** Purpose: Performs the queue test operation. */
	private static void QueueTest() {
		String str = "[][]()";
		Deque<Character> stack = new ArrayDeque<>();
		
		for(char c: str.toCharArray() ) {
		 stack.push(c);
		}
		System.out.println(stack);
		
//		Iterator<Character> itr = stack.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}

		System.out.println("===============================");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}