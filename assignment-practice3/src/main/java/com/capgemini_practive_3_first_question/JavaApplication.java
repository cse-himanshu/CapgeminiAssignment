/**
 * 
 */
package com.capgemini_practive_3_first_question;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Logical Question");
		System.out.println("-----------------");
		System.out.println("Enter a digit to check if its Strictly Incremental");
		int num = scanner.nextInt();
		System.out.println("Enter a string to check if its Strictly Incremental");
		scanner.nextLine();
		String str = scanner.nextLine();
		System.out.println("Enter a array to check if its Strictly Incremental");
		System.out.println("Enter size of array: ");
		int size = scanner.nextInt();
		System.out.println("Enter elements: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Enter a arrayList to check is its Strictly Icremental");
		System.out.println("Enter the size of the arrayList: ");
		int arrayListSize = scanner.nextInt();
		ArrayList<Integer> arrList = new ArrayList<>();
		System.out.println("Enter the elements");
		for(int i = 0; i < arrayListSize; i++) {
			int input = scanner.nextInt();
			arrList.add(input);
		}
		
		Logic.increasingDecreasingNumber(num);
		Logic.increasingDecreasingString(str);
		Logic.increasingDecreasingArrary(arr);
		Logic.increasingDecreasingArrayList(arrList);

	}
}
