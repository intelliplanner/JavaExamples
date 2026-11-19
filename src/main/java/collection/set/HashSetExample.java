/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.set;

import java.util.*;

/** Purpose: Encapsulates employee behavior; it manages collection data reliably. Owner: Virendra Gupta. */
class Employee {
	int id;
	String name;

	/** Purpose: Creates a employee instance. */
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

/** Purpose: Encapsulates hash set example behavior; it manages collection data reliably. Owner: Virendra Gupta. */
class HashSetExample {

		public static void main(String args[]) {

		HashSet<String> al = new HashSet<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add("Ajay");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// =============

		HashSet hashSet = new HashSet();
		hashSet.add(1);
		hashSet.add("test");
		for(Object obj:hashSet) {
			System.out.println(obj);
		}
	}
}
