package stringExample;

/**
 * Encapsulates string pattern behavior for the represented example workflow.
 */
public class StringPattern {

		public static void main(String[] args) {
		int n = 10;
		int k=0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(i+" ");
				i = i + j;
			}
			System.out.println(" ");
			k++;
		}
		System.out.println(" ");
	}

}
