package company.capgemini;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Encapsulates cap behavior for the represented company or real-world workflow.
 */
public class Cap {
        public static void main(String[] str) {
        List<String> li =Arrays.asList("AA","BB","CC","AA");
        li.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);

        List<String> li1 = Arrays.asList("5AA","5AA", "8BB", "CC", "AA");  // find started from integer

        li1.stream().filter(n -> Character.isDigit(n.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);

        li1.stream().filter(n -> Character.isDigit(n.charAt(0))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach(System.out::println);
    }
}
