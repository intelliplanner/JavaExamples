package JavaAnnotations;

import java.util.*;

/**
 * Encapsulates test annotation2 behavior for the represented example workflow.
 */
class TestAnnotation2 {
	
	 	 public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");
		System.out.println(list);
		for (Object obj : list) {
			System.out.println(obj);
		}

	}
}