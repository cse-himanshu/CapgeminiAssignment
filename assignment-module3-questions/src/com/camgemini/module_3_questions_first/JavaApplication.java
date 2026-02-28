package com.camgemini.module_3_questions_first;

import java.util.Scanner;

public interface JavaApplication {
	public static void execute(){
		int size = 100;
		int[] arr = new int[size];
		
		for(int i = 1; i <= size; i++) {
			arr[i - 1] = i;
		}
		
		for(int i : arr) {
			if(i % 2 == 0) {
				System.out.println(i + " is a even number");
			}else {
				System.out.println(i + " is a odd number");
			}
		}
	}
}
