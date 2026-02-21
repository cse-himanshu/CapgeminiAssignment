package test_student;

public class StudentService {
	private int calculateMarks(Student student) {
		return student.getMark1() + student.getMark2() + student.getMark3();
	}
	
	public int avgMarks(Student student) {
		return calculateMarks(student) / 3;
	}
	
	public boolean isPass(Student student) {
		return calculateMarks(student) > 40;
	}
	
}
