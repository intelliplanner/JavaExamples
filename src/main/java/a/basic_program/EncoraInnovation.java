package a.basic_program;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface EncoraInnovation {
    public static  void main(String[] args){
        String data = "raja is java developer, java is a programming language, ravi is engineer";
        data = data.replace(",","");
//        data = data.replace(",","");
        List<String> li = Arrays.asList(data.split(" "));
       // li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().forEach(x-> System.out.println(x.getKey() + " - "+ x.getValue()));
        Map<String,Long> map = li.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        map.entrySet().stream().sorted(Comparator.comparingLong(x-> x.getValue())).forEach(x-> System.out.println(x.getKey() + " - "+ x.getValue()));
        map.entrySet().stream().sorted(Collections.reverseOrder(Comparator.comparingLong(x-> x.getValue()))).forEach(x-> System.out.println(x.getKey() + " - "+ x.getValue()));


    }

}
