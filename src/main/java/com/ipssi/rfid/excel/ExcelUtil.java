package com.ipssi.rfid.excel;

/** Purpose: Encapsulates excel util behavior; it supports the represented example workflow. Owner: Virendra Gupta. */
public final class ExcelUtil {

	/** Purpose: Creates a excel util instance. */
	private ExcelUtil() {
	}

	// capitalize the first letter of the field name for retrieving value of the
	// field later
	/** Purpose: Performs the capitalize initial letter operation. */
	public static String capitalizeInitialLetter(String s) {
		if (s.length() == 0)
			return s;
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

}
