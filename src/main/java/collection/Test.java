package collection;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Encapsulates test behavior for collection data management and lookup.
 */
public class Test {
	String name;
	String subject;
	int age;

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
 * Retrieves or locates get subject data needed for decision-making.
 */
	public String getSubject() {
		return subject;
	}

	/**
 * Updates set subject while keeping domain data consistent.
 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
 * Retrieves or locates get age data needed for decision-making.
 */
	public int getAge() {
		return age;
	}

	/**
 * Updates set age while keeping domain data consistent.
 */
	public void setAge(int age) {
		this.age = age;
	}

		public static void main(String s[]) {
		Test ob = new Test();
		ob.setAge(11);
		JSONObject jsonObj = new JSONObject();
		try {
			jsonObj.append("age", ob);
			//System.out.println(jsonObj.get);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
