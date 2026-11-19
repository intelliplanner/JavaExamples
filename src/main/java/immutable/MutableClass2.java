package immutable;

/**
 * Encapsulates mutable class2 behavior for the represented example workflow.
 */
public class MutableClass2 implements Cloneable {

	/**
 * Performs the clone operation required by the represented example.
 */
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		  
	String name;

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
}
