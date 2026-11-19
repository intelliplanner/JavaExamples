package collection.map;

/** Purpose: Encapsulates mobile behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Mobile /* implements Comparable<Mobile> */ {

	private int id;
	private String brand;
//	private int price;
//	private int year;

	/** Purpose: Creates a mobile instance. */
	public Mobile(int id, String brand) {
		super();
		this.id = id;
		this.brand = brand;
	}

	/** Purpose: Retrieves get id data. */
	public int getId() {
		return id;
	}

	/** Purpose: Updates set id data. */
	public void setId(int id) {
		this.id = id;
	}

	/** Purpose: Retrieves get brand data. */
	public String getBrand() {
		return brand;
	}

	/** Purpose: Updates set brand data. */
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
