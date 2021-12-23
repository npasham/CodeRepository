/**
 * 
 */
package com.code.challenge;

import java.util.List;

/**
 * @author NARESH
 *
 */
public class FizzBuzz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		generate();
		generateOptimize();
	}
	
	private static void generateOptimize() {
		for (int i = 1; i <= 100; i++) {
			System.out.println((i % 3 == 0 && i % 5 == 0)?"FizzBuzz":(i % 3 == 0)?"Fizz":(i % 5 == 0)?"Buzz":String.valueOf(i));
			
		}
	}

	private static void generate() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
