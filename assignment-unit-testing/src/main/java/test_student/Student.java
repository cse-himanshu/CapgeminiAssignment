package test_student;

public class Student {
	private String name;
	private int id;
	private int mark1;
	private int mark2;
	private int mark3;
	
	/**
	 * @param name
	 * @param id
	 * @param mark1
	 * @param mark2
	 * @param mark3
	 */
	public Student(String name, int id, int mark1, int mark2, int mark3) {
		super();
		this.name = name;
		this.id = id;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the mark1
	 */
	public int getMark1() {
		return mark1;
	}
	/**
	 * @param mark1 the mark1 to set
	 */
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	/**
	 * @return the mark2
	 */
	public int getMark2() {
		return mark2;
	}
	/**
	 * @param mark2 the mark2 to set
	 */
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	/**
	 * @return the mark3
	 */
	public int getMark3() {
		return mark3;
	}
	/**
	 * @param mark3 the mark3 to set
	 */
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}

	
}
