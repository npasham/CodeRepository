/**
 * 
 */
package com.code.challenge;

import java.util.Arrays;

/**
 * @author NARESH
 *
 */
public class TwoSumIndices {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numArray = { 10, 20, 30, 40 };
		int target = 50;
		findIndices(numArray, target);

	}

	private static void findIndices(int[] object, int target) {

		for (int i = 0; i < object.length; i++) {
			for (int j = i + 1; j < object.length; j++) {
				System.out.println((object[i] + object[j] == target)
						? "target reached successfully by indices [" + i + "," + j + "]"
						: "target failed by indices[" + i + "," + j + "]");
			}
		}
	}

}
