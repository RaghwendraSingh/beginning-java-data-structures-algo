package org.raghwendra.dsa.lesson1.activity.octaltodecimal;

class OctalToDecimal {
	public static int toDecimal(String octal) {
		int conversion = 1;
		int result = 0;
		for(int i = 1; i <= octal.length(); i ++) {
			if(octal.charAt(octal.length() - i) != '0') {
				result = result + Integer.parseInt(Character.toString(octal.charAt(octal.length() - i))) * conversion;
			}
			conversion *= 8;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println("octal number 17 in decimal is: " + OctalToDecimal.toDecimal("17"));
	}
}