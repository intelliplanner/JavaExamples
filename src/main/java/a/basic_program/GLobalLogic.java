package a.basic_program;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Encapsulates g lobal logic behavior for the represented example workflow.
 */
public class GLobalLogic {

//    Given a large list of integers, calculate the sum of all prime numbers using java 8 stream API
//    List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15);

    public static void main(String[] str){
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 14, 15);
        int l = numbers.stream().filter(p -> p%2==0).collect(Collectors.summingInt(p->p));
        System.out.println(l);
    }

}
