package module_3_new;

public record Student(int id, String name, String email, double number) implements Comparable<Student> {

	@Override
	public int compareTo(Student student) {
		if(this.id > student.id) {
			return 1;
		}else if(this.id < student.id) {
			return -1;
		}
		return 0;
	}
}
