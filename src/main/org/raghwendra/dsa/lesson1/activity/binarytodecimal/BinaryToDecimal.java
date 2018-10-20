package org.raghwendra.dsa.lesson1.activity.binarytodecimal;

class BinaryToDecimal {

	public static int convertToDecimal(String binary) {
	  int conversion = 1;
	  int result = 0;
	  for (int i = 1; i <= binary.length(); i++) {
	    if (binary.charAt(binary.length() - i) == '1')
	      result += conversion;
	    conversion *= 2;
	  }
	  return result;
	}

	public static void main(String[] args) {
		System.out.println("110 is " + BinaryToDecimal.convertToDecimal("110"));
	}
}