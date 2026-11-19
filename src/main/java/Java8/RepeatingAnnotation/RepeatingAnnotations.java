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

/** Purpose: Encapsulates shirt behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
class Shirt {
}

/** Purpose: Encapsulates repeating annotations behavior; it demonstrates Java 8 behavior. Owner: Virendra Gupta. */
public class RepeatingAnnotations {

		public static void main(String[] args) {
		Color[] colorArray = Shirt.class.getAnnotationsByType(Color.class);
		for (Color color : colorArray) {
			System.out.println(color.name());
		}
	}

}
