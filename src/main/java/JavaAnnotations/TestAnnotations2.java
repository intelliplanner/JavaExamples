package JavaAnnotations;

import java.util.*;

/** Purpose: Encapsulates test annotation2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
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