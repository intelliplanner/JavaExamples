package Random;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Encapsulates random behavior for the represented example workflow.
 */
public class Random {
	 /**
 * Retrieves or locates get random string data needed for decision-making.
 */
	 static String getRandomString() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
	
	 	 public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(getRandomString());
		}
		
	}
}
