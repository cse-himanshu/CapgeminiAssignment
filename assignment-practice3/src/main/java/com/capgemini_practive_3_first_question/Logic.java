/**
 * 
 */
package com.capgemini_practive_3_first_question;

import java.util.ArrayList;

/**
 * 
 */

// Logic for checking if a number is increasing or not
public class Logic {
	public static void increasingDecreasingNumber(int num) {
		int size = 0;
		int temp = num;

		while (temp > 0) {
			temp /= 10;
			size++;
		}
		if (checkEven(size)) {
			System.out.println(num + " is Even length");
			return;
		}

		temp = num;
		int[] arr = new int[size];
		int i = 0;
		while (temp > 0) {
			int digit = temp % 10;
			arr[i] = digit;
			i++;
			temp /= 10;
		}

		int position = 0;
		int negative = 0;
		boolean inc = false;

		for (int j = 1; j < size; j++) {
			if (j == 1) {
				if (arr[j] - arr[j - 1] == 1) {
					inc = true;
				}
			}
			if (arr[j] - arr[j - 1] == 1) {
				position++;
			} else if (arr[j] - arr[j - 1] == -1) {
				negative++;
			}
		}

		if (inc && position == negative) {
			System.out.println(num + " is Strictly Increasing and Decreasing");
		} else if (!inc && position == negative) {
			System.out.println(num + " is Strictly Decreasing and Increasing");
		} else {
			System.out.println(num + " is Neither Decreasing nor Increasing");
		}

		boolean flag = false;
		for (int j = 1; j < size; j++) {
			if (arr[j] - arr[j - 1] != -1) {
				flag = true;
				System.out.println(num + " is not Strictly Increasing");
				break;
			}
		}
		if(!flag) {
			System.out.println(num + " is Strictly Increasing");
		}
		
		flag = false;
		for (int j = 1; j < size; j++) {
			if (arr[j] - arr[j - 1] != 1) {
				flag = true;
				System.out.println(num + " is not Strictly Decreasing");
				break;
			}
		}
		if(!flag) {
			System.out.println(num + " is Strictly Decreasing");
		}
	}

	public static void increasingDecreasingString(String str) {
		int size = str.length();
		if (checkEven(size)) {
			System.out.println(str + " is Even in length");
			return;
		}

		char[] arr = str.toCharArray();
		
		int position = 0;
		int negative = 0;
		boolean inc = false;

		for (int j = 1; j < size; j++) {
			if (j == 1) {
				if (arr[j] - arr[j - 1] == 1) {
					inc = true;
				}
			}
			if (arr[j] - arr[j - 1] == 1) {
				position++;
			} else if (arr[j] - arr[j - 1] == -1) {
				negative++;
			}
		}

		if (inc && position == negative) {
			System.out.println(str + " is Strictly Increasing and Decreasing");
		} else if (!inc && position == negative) {
			System.out.println(str + " is Strictly Decreasing and Increasing");
		} else {
			System.out.println(str + " is Neither Decreasing nor Increasing");
		}
		
		boolean flag = false;
		
		
		for (int i = 1; i < size; i++) {
			if (arr[i] - arr[i - 1] != 1) {
				flag = true;
				System.out.println(str + " is not Strictly Increasing");
				break;
		}
			if(!flag) {
				System.out.println(str + " is Strictly Increasing");
			}
			
			flag = false;
			for (int j = 1; j < size; j++) {
				if (arr[j] - arr[j - 1] != -1) {
					flag = true;
					System.out.println(str + " is not Strictly Decreasing");
					break;

				}
			}
			if(!flag) {
				System.out.println(str + " is Strictly Deccreasing");
			}
		}
	}

	public static void increasingDecreasingArrary(int[] arr) {
		int size = arr.length;
		if (checkEven(size)) {
			System.out.println("Array is of Even length");
			return;
		}
		
		int position = 0;
		int negative = 0;
		boolean inc = false;

		for (int j = 1; j < size; j++) {
			if (j == 1) {
				if (arr[j] - arr[j - 1] == -1) {
					inc = true;
				}
			}
			if (arr[j] - arr[j - 1] == 1) {
				position++;
			} else if (arr[j] - arr[j - 1] == 1) {
				negative++;
			}
		}

		if (inc && position == negative) {
			System.out.println("Array is Strictly Increasing and Decreasing");
		} else if (!inc && position == negative) {
			System.out.println("Array is Strictly Decreasing and Increasing");
		} else {
			System.out.println("Array is Neither Decreasing nor Increasing");
		}
		
		boolean flag = false;
		
		for (int i = 1; i < size; i++) {
			if (arr[i] - arr[i - 1] != 1) {
				flag = true;
				System.out.println("Array is Not Strictly Increasing");
				break;
			}
		}
		if(!flag) {
			System.out.println("Array is Strictly Increasing");
		}
		
		flag = false;
		for (int i = 1; i < size; i++) {
			if (arr[i] - arr[i - 1] != -1) {
				flag = true;
				System.out.println("Array is Not Strictly Decreasing");
				break;
			}
		}
		if(!flag) {
			System.out.println("Array is Strictly Decreasing");
		}
	}

	public static void increasingDecreasingArrayList(ArrayList<Integer> arrList) {
		int size = arrList.size();

		if (checkEven(size)) {
			System.out.println("ArrayList is Even Length");
			return;
		}
		
		int position = 0;
		int negative = 0;
		boolean inc = false;

		for (int j = 1; j < size; j++) {
			if (j == 1) {
				if (arrList.get(j) - arrList.get(j - 1) == -1) {
					inc = true;
				}
			}
			if (arrList.get(j) - arrList.get(j - 1) == 1) {
				position++;
			} else if (arrList.get(j) - arrList.get(j - 1) == -1) {
				negative++;
			}
		}

		if (inc && position == negative) {
			System.out.println("ArrayList is Strictly Increasing and Decreasing");
		} else if (!inc && position == negative) {
			System.out.println("ArrayList is Strictly Decreasing and Increasing");
		} else {
			System.out.println("ArrayList is Neither Decreasing nor Increasing");
		}
		
		for (int i = 1; i < size; i++) {
			if (arrList.get(i) - arrList.get(i - 1) != 1) {
				System.out.println("ArrayList is Not Strictly Increasing");
				break;
			}
		}
		System.out.println("ArrayList is Strictly Increasing");

		for (int i = 1; i < size; i++) {
			if (arrList.get(i) - arrList.get(i - 1) != -1) {
				System.out.println("ArrayList is Not Strictly Decreasing");
				break;
			}
		}

		System.out.println("ArrayList is Strictly Decreasing");
	}

	public static boolean checkEven(int size) {
		return size % 2 == 0 ? true : false;
	}
}
