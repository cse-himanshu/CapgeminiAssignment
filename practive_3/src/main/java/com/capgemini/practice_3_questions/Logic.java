/**
 * 
 */
package com.capgemini.practice_3_questions;

/**
 * 
 */
public class Logic {
	public static char second(String str, boolean flag) {
		char[] arr = str.toCharArray();
		return flag ? arr[0] : arr[arr.length - 1]; 
	}
	
	public static int ticket(int speed, boolean birthday) {
		int extra = birthday ? 5 : 0;
		int ans = 0;
		if(speed <= 60 + extra) {
			ans = 0;
		}else if(speed >= 61 + extra && speed <= 80 + extra) {
			ans = 1;
		}else if(speed > 81 + extra) {
			ans = 2;
		}
		
		return ans;
	}
	
	public static boolean first(int[] arr) {
		return arr[0] == 9 || arr[arr.length - 1] == 9;
	}
	
	public static boolean Monkey(boolean a, boolean b) {
		return a && b;
	}
	
	public static int party(int candy, int tea) {
		int ans = 0;
		if(candy == 5 && tea == 5) {
			ans = 1;
		}else if(candy * 2 == tea || tea * 2 == candy) {
			ans = 2;
		}
		return ans;
	}
	
	public static int[] swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		
		return arr;
	}
	
	
	
	
}
