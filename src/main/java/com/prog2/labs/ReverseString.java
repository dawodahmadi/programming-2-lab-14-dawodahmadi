package com.prog2.labs;
/**
 * @author adinashby
 *
 */

public class ReverseString {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	//public static void main(String[] args) {
		
		public String reverseString(String input) {
			if (input.equals("")) {
				return "";			
		}
		
		return reverseString(input.substring(1)) + input.charAt(0);
		
	}

	
}
