package company.autozone;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

/** Purpose: Encapsulates auto zone2nd r behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class AutoZone2ndR {
		
		public static void main(String str[]) {
		palidromePrime();
	}

	/** Purpose: Performs the palidrome prime operation. */
	private static void palidromePrime() {
//		List<Integer> n  =  Arrays.asList(1,3,5,6,7,10);
//		IntStream.rangeClosed(1, 100).filter(i -> i/)
			for(int i =1;i<100;i++) {
				String l = Integer.toString(i);
				char[] c = new char[l.length()];  
				int k=0;
				for(int j=l.length()-1;j>=0;j--) {
					 c[k] = l.charAt(j);
					 k++;
				}
				if(l.compareTo(new String(c)) == 0) {
				  int t = Integer.parseInt(new String(c));
					if(i <= 3) {
						System.out.println("Palindrom & prime no."+ t);
					}else {
						int rem = 0;
						for(int h=2;h < t;h++ ) {
							 rem = t%h;
							if(rem == 0) {
								break;
							}
						}
						if(rem > 0) {
							System.out.println("Palindrom & prime no."+ i);
						}
						
					}

				}

			}

	}
}
