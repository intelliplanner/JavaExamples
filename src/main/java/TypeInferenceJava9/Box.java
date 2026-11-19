package TypeInferenceJava9;

/**
 * Encapsulates box behavior for the represented example workflow.
 */
public class Box<T> {

	private T t; // T stands for "Type"

	/**
 * Updates set while keeping domain data consistent.
 */
	public void set(T t) {
		this.t = t;
	}

	/**
 * Retrieves or locates get data needed for decision-making.
 */
	public T get() {
		return t;
	}
}