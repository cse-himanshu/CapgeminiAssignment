package module_3_string;

public interface JavaApplication {
	public static void execution() {
		String s1 = "java";
		System.out.println(s1);
		
		String s2 = new String("java");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
}
