package immutable;

/** Purpose: Encapsulates mutable class2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class MutableClass2 implements Cloneable {

	/** Purpose: Performs the clone operation. */
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		  
	String name;

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Updates set name data. */
	public void setName(String name) {
		this.name = name;
	}
}
