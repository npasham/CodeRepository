/*
 * Reverse of the given string using the String builder reverse API
 * 
 */

package com.code.challenge;

public class ReverseString {

	public static void main(String[] args) {

		String value = "Hello World !";
		System.out.println("Actual Value of String:"+value);
		reverseStringManually(value);
		reverseStringUsingStringBuilder(value);

	}

	/**
	 * @param value
	 */
	private static void reverseStringManually(String value) {
		StringBuilder str= new StringBuilder();
		for(int i=value.length()-1;i>=0;i--) {
			str.append(value.charAt(i));
//			System.out.println(str);
		}
		System.out.println("ReverseString Manually ="+str);
	}

	/**
	 * @param value
	 */
	private static void reverseStringUsingStringBuilder(String value) {
		StringBuilder strBuilder = new StringBuilder(value);
		strBuilder.reverse();
		System.out.println("ReverseString using Builder API ="+strBuilder);
	}
	
	

}
