package inteviewQuestion.Wipro;

//check String is pandrome/
/** Purpose: Encapsulates test dec292021 behavior; it solves the represented coding problem. Owner: Virendra Gupta. */
public class TestDec292021 {
		
		public static void main(String args[]) {
		System.out.println(checkPalindromeString("NAMAN"));
	}

	/** Purpose: Validates check palindrome string conditions. */
	private static boolean checkPalindromeString(String str) {
		StringBuffer s = new StringBuffer(str);
//		s.reverse();
		String sNew = s.reverse().toString();
		if(sNew.equals(str)) {
			return true;
		}
		return false;
	}
}
