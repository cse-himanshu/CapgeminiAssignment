/**
 * 
 */
package com.capgemini.practice_3_questions;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		int[] arr = {9, 1, 3, 4, 9};
		System.out.println(Logic.first(arr));
		
		System.out.println(Logic.second("Hello", false));
		
		System.out.println(Logic.Monkey(false, false));
		
		System.out.println(Logic.party(5, 5));
		
		int[] temp = Logic.swap(arr);
		
		for(int i : temp) {
			System.out.print(i + " ");
		}+
		
		System.out.println(Logic.ticket(100, false));
		
	}
}
