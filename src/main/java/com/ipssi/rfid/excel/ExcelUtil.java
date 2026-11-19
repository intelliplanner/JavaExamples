package com.ipssi.rfid.excel;

/**
 * Encapsulates excel util behavior for the represented example workflow.
 */
public final class ExcelUtil {

	/**
 * Creates a configured excel util instance for the represented workflow.
 */
	private ExcelUtil() {
	}

	// capitalize the first letter of the field name for retrieving value of the
	// field later
	public static String capitalizeInitialLetter(String s) {
		if (s.length() == 0)
			return s;
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

}
