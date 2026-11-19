package Generic;

import java.util.ArrayList;
import java.util.List;

/** Purpose: Encapsulates shape behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
abstract class Shape{
	
	/** Purpose: Performs the draw operation. */
	abstract void draw();
}

/** Purpose: Encapsulates rectangle behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Rectangle extends Shape{

	@Override
	
	/** Purpose: Performs the draw operation. */
	void draw() {
		System.out.println("Rectangle");
	}
}

/** Purpose: Encapsulates circle behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
class Circle extends Shape{

	@Override
	
	/** Purpose: Performs the draw operation. */
	void draw() {
		System.out.println("Circle");
	}
}

/** Purpose: Encapsulates generic test class behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class GenericTestClass {

	/** Purpose: Performs the draw shapes operation. */
	public void drawShapes(List<? extends Shape> lists) {
		for(Shape s: lists) {
			System.out.println(s);
		}
	}

		public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		List<String> list2 = new ArrayList<String>();
		list2.add("test1");
		list2.add("test2");
		list2.add("test3");
		list2.add("test4");
		list2.add("test5");
		list2.add("test5");		
	}

}
