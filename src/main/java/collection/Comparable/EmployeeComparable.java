package collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Encapsulates employee comparable behavior for collection data management and lookup.
 */
public class EmployeeComparable {
		public static void main(String[] args) {
		ArrayList<Employee> es = new ArrayList<Employee>(); 
		es.add(new Employee(10, 20000, "vicky"));
		es.add(new Employee(5, 15000, "Ak"));
		es.add(new Employee(5, 15000, "Ak"));
		es.add(new Employee(30, 25000, "qawsed"));
        Collections.sort(es);
		for(Employee st: es){  
			System.out.println(st.age+" "+st.name+" "+st.salary);  
		}  
	}
}
