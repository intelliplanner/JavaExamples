package Java8.Example;

import java.util.function.BiFunction;

/** Purpose: Encapsulates method reference3 behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class MethodReference3 {
		
		public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}