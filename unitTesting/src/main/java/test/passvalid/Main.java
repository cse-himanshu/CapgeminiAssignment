package test.passvalid;

public class Main {
	public static void main(String[] args) {
		LoginValidator v = new LoginValidator();
		
		System.out.println(v.validateUsernameAnsPassword("username1", "1234@Password"));
	}
}
