package collection.Comparator.ProductComparator;

import java.util.Comparator;

/** Purpose: Encapsulates product name comparator behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class ProductNameComparator implements Comparator<Product> {

	@Override
	
	/** Purpose: Performs the compare operation. */
	public int compare(Product o1, Product o2) {
		return o1.name.compareTo(o2.name);
	}
}
