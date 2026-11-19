package collection.Comparator.ProductComparator;

import java.util.Comparator;

/** Purpose: Encapsulates product price comparator behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class ProductPriceComparator implements Comparator<Product> {

	@Override
	
	/** Purpose: Performs the compare operation. */
	public int compare(Product o1, Product o2) {
		if(o1.price == o2.price) 
			return 0;
		else if(o1.price < o2.price) 
			return -1;
		else 
			return 1;
	}

}
