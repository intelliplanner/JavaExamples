package Random;

import java.math.BigInteger;
import java.security.SecureRandom;

/** Purpose: Encapsulates random behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public class Random {
	 
	 /** Purpose: Retrieves get random string data. */
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
