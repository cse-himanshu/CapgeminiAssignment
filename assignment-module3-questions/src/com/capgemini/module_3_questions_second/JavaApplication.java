/**
 * 
 */
package com.capgemini.module_3_questions_second;

import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication {
	public static void execute() {
		String[] weeks = new String[7];
		String[] months = new String[12];
		String[] direction = new String[8];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weeks: ");
		
		for(int i = 0; i < 7; i++) {
			weeks[i] = scanner.nextLine();
		}
		
		System.out.println("Enter months: ");
		
		for(int i = 0; i < 12; i++) {
			months[i] = scanner.nextLine();
		}
		
		System.out.println("Enter direction: ");
		
		for(int i = 0; i < 8; i++) {
			direction[i] = scanner.nextLine();
		}
		
		
		int[] digits = new int[10];
		
		for(int i = 0; i < 10; i++) {
			digits[i] = i;
		}
		
		for(int i : digits) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		char[] upperCase = new char[26];
		
		for(char i = 'A'; i <= 'Z'; i++) {
			upperCase[i - 'A'] = i;
		}
		
		for(char i : upperCase) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		char[] lowerCase = new char[26];
		
		for(char i = 'a'; i <= 'z'; i++) {
			lowerCase[i - 'a'] = i;
		}
		
		for(char i : lowerCase) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(String i : weeks) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(String i : months) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(String i : direction) {
			System.out.print(i + " ");
		}
	}
}
