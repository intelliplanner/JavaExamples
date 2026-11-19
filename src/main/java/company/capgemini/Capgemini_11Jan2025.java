package company.capgemini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/** Purpose: Encapsulates capgemini_11 jan2025 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Capgemini_11Jan2025  {

        public static void main(String[] str) {
        String name = "Virendra Gupta";
//        countCharFirstWay(name);
        charCountJava8(name);

    }

    /** Purpose: Performs the char count java8 operation. */
    private static void charCountJava8(String name) {
        char[] ch = name.toCharArray();
        List<String> arr = new ArrayList();

        for (int i = 0; i < ch.length; i++) {
            String n = ch[i] + "";
            if (n.trim().length() == 0) continue;
            arr.add(n);
        }

//        List<String> arr1 =    Arrays.asList(Arrays.toString(name.toCharArray()));
        arr.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(n-> System.out.println(n.getKey()+", "+n.getValue()));
        System.out.print(arr);

//        List<String>
//        HashMap<String,Integer> =
    }

    /** Purpose: Performs the count char first way operation. */
    private static void countCharFirstWay(String name) {
        HashMap<String, Integer> map = new HashMap<>();
        char[] ch = name.trim().toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            String n = ch[i] + "";
            if (n.trim().length() == 0) continue;
            count = 0;
            if (map.containsKey(n)) {
                count = map.get(n);
                map.put(n, ++count);
            } else {
                map.put(n, ++count);
            }
        }
        System.out.println(map);

    }

}
