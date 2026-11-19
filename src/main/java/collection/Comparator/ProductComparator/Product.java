package collection.Comparator.ProductComparator;

/** Purpose: Encapsulates product behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Product {
	int id;
	String name;
	float price;

	/** Purpose: Creates a product instance. */
	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

//	@Override
//    public int hashCode() {
//		return this.id;
//	}

//	@Override
//	public boolean equals(Object obj) {
//	        return false;
//	}

	/** Purpose: Retrieves get id data. */
	public int getId() {
		return id;
	}

	/** Purpose: Updates set id data. */
	public void setId(int id) {
		this.id = id;
	}

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Updates set name data. */
	public void setName(String name) {
		this.name = name;
	}

	/** Purpose: Retrieves get price data. */
	public float getPrice() {
		return price;
	}

	/** Purpose: Updates set price data. */
	public void setPrice(float price) {
		this.price = price;
	}
}
