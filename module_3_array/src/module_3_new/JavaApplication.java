package module_3_new;

import java.util.Arrays;

public interface JavaApplication {
	public static void display(Student[] arr) {
		for (Student student : arr) {
			System.out.println(student);
		}
		System.out.println();
	}
	public static void execution() {
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "steel", "example@gmail.com", 123456789);
		arr[1] = new Student(3, "steel3", "example3@gmail.com", 234567898);
		arr[2] = new Student(2, "steel2", "example2@gmail.com", 34567890);
		arr[3] = new Student(5, "steel5", "exmapl5@gmail.com", 234543234);
		arr[4] = new Student(4, "steel4", "exmaple4@gmail.com", 234543434);
		Arrays.sort(arr);
		display(arr);
	}
}
