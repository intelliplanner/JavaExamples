package collection.Comparator.ProductComparator;

/**
 * Encapsulates product behavior for collection data management and lookup.
 */
public class Product {
	int id;
	String name;
	float price;

	/**
 * Creates a configured product instance for the represented workflow.
 */
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

	public int getId() {
		return id;
	}

	/**
 * Updates set id while keeping domain data consistent.
 */
	public void setId(int id) {
		this.id = id;
	}

	/**
 * Retrieves or locates get name data needed for decision-making.
 */
	public String getName() {
		return name;
	}

	/**
 * Updates set name while keeping domain data consistent.
 */
	public void setName(String name) {
		this.name = name;
	}

	/**
 * Retrieves or locates get price data needed for decision-making.
 */
	public float getPrice() {
		return price;
	}

	/**
 * Updates set price while keeping domain data consistent.
 */
	public void setPrice(float price) {
		this.price = price;
	}
}
