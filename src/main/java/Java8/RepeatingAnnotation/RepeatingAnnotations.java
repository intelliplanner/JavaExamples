package Java8.RepeatingAnnotation;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Colors.class)
@interface Color {
	String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Colors {
	Color[] value();
}

@Color(name = "red")
@Color(name = "blue")
@Color(name = "green")
/**
 * Encapsulates shirt behavior for the represented example workflow.
 */
class Shirt {
}

/**
 * Encapsulates repeating annotations behavior for the represented example workflow.
 */
public class RepeatingAnnotations {

		public static void main(String[] args) {
		Color[] colorArray = Shirt.class.getAnnotationsByType(Color.class);
		for (Color color : colorArray) {
			System.out.println(color.name());
		}
	}

	
	
}
