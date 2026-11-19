package immutable;

/** Purpose: Encapsulates immutble class2 behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class ImmutbleClass2{
	private final MutableClass2 mc2;

	/** Purpose: Performs the clone operation. */
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  

	/** Purpose: Creates a immutble class2 instance. */
	public ImmutbleClass2(MutableClass2 mc2) {
		this.mc2 = mc2;
	}

	/** Purpose: Retrieves get mc2 data. */
	public MutableClass2 getMc2() throws CloneNotSupportedException {
		return (MutableClass2) mc2.clone();
	}

	@Override
	
	/** Purpose: Provides a readable object representation. */
	public String toString() {
		return "ImmutbleClass2 [m2 name=" + mc2.getName() + "]";
	}
	
}
