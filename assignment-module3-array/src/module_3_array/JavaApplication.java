package module_3_array;

import java.lang.reflect.Array;
import java.util.Iterator;

public interface JavaApplication {
	public static void execution() {
		int[] array;
		array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		
		for(int i : array) {
			System.out.println(i + " ");
		}
	}
	
	public static void execution2() {
		int[] array = (int[]) Array.newInstance(int.class, 3);
		Array.setInt(array, 0, 1);
		Array.setInt(array, 1, 2);
		Array.setInt(array, 2, 3);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(Array.getInt(array, i));
		}
		
		
	}
}	
