package company.deloit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Encapsulates deloit test behavior for the represented company or real-world workflow.
 */
public class DeloitTest {

		public static void main(String[] args) {
		List<Employee> li = new ArrayList<>();
		li.add(new Employee(1, 14, "D", "A"));
		li.add(new Employee(2, 14, "A", "B"));
		li.add(new Employee(3, 14, "B", "B"));
		li.add(new Employee(4, 14, "C", "A"));
		
//	 li.stream().collect(Collectors.groupingBy(Employee:: getdeparment,Collections.toLi(Comparator.comparingInt(Employee::getAge)));
	}

}
