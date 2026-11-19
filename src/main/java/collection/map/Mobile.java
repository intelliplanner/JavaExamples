package collection.map;

/**
 * Encapsulates mobile behavior for collection data management and lookup.
 */
public class Mobile /* implements Comparable<Mobile> */ {

	private int id;
	private String brand;
//	private int price;
//	private int year;


	public Mobile(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}

	/**
 * Retrieves or locates get id data needed for decision-making.
 */
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
 * Retrieves or locates get brand data needed for decision-making.
 */
	public String getBrand() {
		return brand;
	}

	/**
 * Updates set brand while keeping domain data consistent.
 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}
//
//	@Override
//	public int compareTo(Mobile mobile) {
//		return (int)(this.id -  mobile.getId());
//	}

}
