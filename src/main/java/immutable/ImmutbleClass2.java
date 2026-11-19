package immutable;

/**
 * Encapsulates immutble class2 behavior for the represented example workflow.
 */
public class ImmutbleClass2{
	private final MutableClass2 mc2;

	/**
 * Performs the clone operation required by the represented example.
 */
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		  
	/**
 * Creates a configured immutble class2 instance for the represented workflow.
 */
	public ImmutbleClass2(MutableClass2 mc2) {
		this.mc2 = mc2;
	}
	
	/**
 * Retrieves or locates get mc2 data needed for decision-making.
 */
	public MutableClass2 getMc2() throws CloneNotSupportedException {
		return (MutableClass2) mc2.clone();
	}

	@Override
	/**
 * Provides a readable representation for reporting or diagnostics.
 */
	public String toString() {
		return "ImmutbleClass2 [m2 name=" + mc2.getName() + "]";
	}
	
}
