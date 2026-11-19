package collection;

import org.json.JSONException;
import org.json.JSONObject;

/** Purpose: Encapsulates test behavior; it manages collection data reliably. Owner: Virendra Gupta. */
public class Test {
	String name;
	String subject;
	int age;

	/** Purpose: Retrieves get name data. */
	public String getName() {
		return name;
	}

	/** Purpose: Updates set name data. */
	public void setName(String name) {
		this.name = name;
	}

	/** Purpose: Retrieves get subject data. */
	public String getSubject() {
		return subject;
	}

	/** Purpose: Updates set subject data. */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/** Purpose: Retrieves get age data. */
	public int getAge() {
		return age;
	}

	/** Purpose: Updates set age data. */
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
