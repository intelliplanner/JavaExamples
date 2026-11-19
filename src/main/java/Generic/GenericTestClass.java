package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulates shape behavior for the represented example workflow.
 */
abstract class Shape{
	/**
 * Performs the draw operation required by the represented example.
 */
	abstract void draw();
}

/**
 * Encapsulates rectangle behavior for the represented example workflow.
 */
class Rectangle extends Shape{

	@Override
	/**
 * Performs the draw operation required by the represented example.
 */
	void draw() {
		System.out.println("Rectangle");
	}
}

/**
 * Encapsulates circle behavior for the represented example workflow.
 */
class Circle extends Shape{

	@Override
	/**
 * Performs the draw operation required by the represented example.
 */
	void draw() {
		System.out.println("Circle");
	}
}

/**
 * Encapsulates generic test class behavior for the represented example workflow.
 */
public class GenericTestClass {

	/**
 * Performs the draw shapes operation required by the represented example.
 */
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
