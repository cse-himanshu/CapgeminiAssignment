package test.student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import test_student.Student;
import test_student.StudentService;

public class StudentServiceTest {
	private StudentService studentService;
	private Student student;
	
	@BeforeAll
	void setup() {
		studentService = new StudentService();
		student = new Student("Amit",101 , 80, 90, 70);
	}
	
	@Test
	void avgMarksTest() {
		assertEquals(80, studentService.avgMarks(student));
	}
	
	@Test
	void isStudentPassTest() {
		assertTrue(StudentService.isPass(student));
	}
}
