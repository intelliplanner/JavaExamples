package a.basic_program;

/**
 * Encapsulates root calculation behavior for the represented example workflow.
 */
public class RootCalculation {
	/**
 * Performs the root calc operation required by the represented example.
 */
	public static double rootCalc(int number) {
		double temp;
		double sr = number / 2;
		do {
			temp = sr;
			sr = (temp + (number / temp)) / 2;
		} while ((temp - sr) != 0);

		return sr;
	}

		public static void main(String args[]) {
		System.out.print("Input Value: ");
		// Scanner sc = new Scanner(System.in);
		// int inp=sc.nextInt();
		// System.out.println(inp);
		System.out.println("Root Value " + rootCalc(64));
	}
}
