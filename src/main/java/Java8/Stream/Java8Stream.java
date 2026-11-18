	package Java8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Stream {
    public static void main(String[] args) {
//        finOddIndexValue();
    	findEvenIndexValues();
    }

    private static void finOddIndexValue() {
        List<String> li = Arrays.asList("a","b","c","d","e");
        List<String> oddIndexValues =
                IntStream.range(0,li.size()).filter(i->i%2 != 0).mapToObj(li :: get).collect(Collectors.toList());
        System.out.println("Odd index values: " + oddIndexValues);
    }
    
    public static void findEvenIndexValues() {
    	  List<String> li = Arrays.asList("a","b","c","d","e");
    	  li = IntStream.range(0, li.size()).filter(i->i%2==0).mapToObj(li :: get).collect(Collectors.toList());
    	  li.forEach(s-> System.out.println(s));
    }
}
