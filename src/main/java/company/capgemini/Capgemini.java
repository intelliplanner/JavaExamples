package company.capgemini;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Purpose: Encapsulates capgemini behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Capgemini {

		public static void main(String[] args) {
//        Employee e1 = new Employee();
//        List<Employee> li = new ArrayList<>() ;
//        Map <String,Employee> map = new LinkedHashMap<>(li.)
////        Map<String, Employee> result = li.stream().
//
//        Collections.sort(li,(o1,o2) -> o1.getName().compareTo(o2.Name()));
//
		List<String> l1 = Arrays.asList("ABC",  "XYZ","pnq");
		List<String> l2 = Arrays.asList("ABC",  "XYZ","lmn");

		List m =   l1.stream().filter(li -> !l2.contains(l1)).collect(Collectors.toList());
//        System.out.println(m);

		String s = "Virendra";
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}

	}

}
