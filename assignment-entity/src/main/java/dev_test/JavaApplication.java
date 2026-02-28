package dev_test;

public interface JavaApplication {
	public static void execution() {
		Object o = new A();
		
		try {
			B b = (B) o;
			System.out.println("Typecasting Done Successfully");
		}catch(ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
