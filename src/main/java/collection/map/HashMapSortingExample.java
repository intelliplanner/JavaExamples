package collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Demonstrates sorting hash-map data by keys and values for collection reporting.
 * It addresses the need to present map records in predictable business order.
 */
public class HashMapSortingExample {

	/**
	 * Starts the map-sorting examples and coordinates the demonstrated workflow.
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("C", 4000);
		map.put("A", 1000);
		map.put("D", 3000);
		map.put("B", 6000);
		map.put("E", 2000);

//		HashMapSortingByKey(map);

//		HashMapObjectSortingByTreeMapUsingKey();

		HashMapSortingByValue();

//		HashMapObjectSortingByValue();

	}

	/**
	 * Demonstrates sorting map objects by value for data-driven reporting.
	 */
	private static void HashMapObjectSortingByValue() {

	}

	/**
	 * Sorts map entries by key so collection results follow a predictable order.
	 */
	private static void HashMapSortingByKey(HashMap<String, Integer> map) {
		TreeMap<String, Integer> tree = new TreeMap(map);
		System.out.println("HashMapSortingByKey: " + map);
		for (Map.Entry<String, Integer> set : map.entrySet()) {
			System.out.println(set.getKey() + ", " + set.getValue());
		}
	}

	/**
	 * Sorts object-based map entries by key for consistent employee lookup.
	 */
	private static void HashMapObjectSortingByTreeMapUsingKey() {
//		Example1
//		
//		HashMap<Integer, Mobile> map1 = new HashMap<>(); 
//		Mobile m1 = new Mobile(2, "Mher");
//		map1.put(m1.getId(),m1);
//		Mobile m2 = new Mobile(1, "Annie");
//		map1.put(m2.getId(),m2);
//		Mobile m3 = new Mobile(3, "John");
//		map1.put(m3.getId(),m3);
//		
//		for(Map.Entry<Integer, Mobile> set:  map1.entrySet() ) {
//			System.out.println(set.getKey() + ", " + set.getValue().getId() + ", "+  set.getValue().getBrand());
//		}
//		
//		Example2 

		Map<String, Employee> map = new HashMap<>();

		Employee employee1 = new Employee(1L, "Mher");
		map.put(employee1.getName(), employee1);
		Employee employee2 = new Employee(22L, "Annie");
		map.put(employee2.getName(), employee2);
		Employee employee3 = new Employee(8L, "John");
		map.put(employee3.getName(), employee3);
		Employee employee4 = new Employee(2L, "George");
		map.put(employee4.getName(), employee4);

		for (Map.Entry<String, Employee> set : map.entrySet()) {
			System.out.println(set.getKey() + ", " + set.getValue().getId() + ", " + set.getValue().getName());
		}
		System.out.println("======================After Sort=================");
		TreeMap<String, Employee> sorted = new TreeMap<>(map);
		for (Map.Entry<String, Employee> set : sorted.entrySet()) {
			System.out.println(set.getKey() + ", " + set.getValue().getId() + ", " + set.getValue().getName());
		}

	}

	/**
	 * Sorts map entries by value so higher-priority records can be reported first.
	 */
	private static void HashMapSortingByValue() {
		Map<String, Employee> map = new HashMap<>();

		Employee employee1 = new Employee(1L, "Mher");
		map.put(employee1.getName(), employee1);
		Employee employee2 = new Employee(22L, "Annie");
		map.put(employee2.getName(), employee2);
		Employee employee3 = new Employee(8L, "John");
		map.put(employee3.getName(), employee3);
		Employee employee4 = new Employee(2L, "George");
		map.put(employee4.getName(), employee4);
		Map<String, Employee> result = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap<String, Employee>::new));
		result.entrySet().stream().forEach(set -> System.out
				.println(set.getKey() + ", " + set.getValue().getId() + ", " + set.getValue().getName()));
		
	}

}
