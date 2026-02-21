package com.capgemini.module_3_questions_three;

import java.lang.reflect.Array;

public interface JavaApplication {
	public static void execute() {
//		Student[] students = (Student[]) Array.newInstance(Student.class, 3);
//		Array.set(students, 0, new Student(1, "First", "example@gmail.com", 'M', 1234, "CSE"));
//		Array.set(students, 1, new Student(1, "Second", "example@gmail.com", 'M', 1234, "CSE"));
//		Array.set(students, 2, new Student(1, "Third", "example@gmail.com", 'M', 1234, "CSE"));
//		
//		for(int i = 0; i < students.length; i++) {
//			Student student = (Student) Array.get(students, i);
//			student.display();
//		}
		
		String s1 = "abc";
		String s2 = "dbe";
		s1 = s1 + s2;
		
		System.out.println(s1);
	}
}
