package collection.Comparator.ProductComparator;

import java.util.Comparator;

/**
 * Encapsulates product name comparator behavior for collection data management and lookup.
 */
public class ProductNameComparator implements Comparator<Product> {

	@Override
	/**
 * Performs the compare operation required by the represented example.
 */
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);
	}
}
