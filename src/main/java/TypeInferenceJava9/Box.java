package TypeInferenceJava9;

/** Purpose: Encapsulates box behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Box<T> {

	private T t; // T stands for "Type"

	/** Purpose: Updates set data. */
	public void set(T t) {
		this.t = t;
	}

	/** Purpose: Retrieves get data. */
	public T get() {
		return t;
	}
}