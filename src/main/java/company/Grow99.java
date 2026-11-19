package company;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Encapsulates grow99 behavior for the represented company or real-world workflow.
 */
public class Grow99 {

public static void main(String[] str)

//    Write a java program to Count and Sort Word Frequencies in a Paragraph : Java is great. Java is object oriented. Java is platform independent.
{
    String data = "Java is great. Java is object oriented. Java is platform independent";

    List<String> list = Arrays.asList(data.split(" "));
    Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    map.entrySet().stream().forEach(x->System.out.println(x.getKey() +" - " + x.getValue()));

//    map.entrySet().stream().sorted(Comparator.reverseOrder(Comparator.comparingLong(x->x.)).forEach();

//    map.entrySet().stream().sorted(Comparator.reverseOrder(Comparator.comparingLong(y->y.getValue())).forEach(x->System.out.println(x.getKey() +" - " + x.getValue()));
}

}
