package test.passvalid;

public class LoginValidator {
	
	public boolean isContain(String password) {
		int d = 0, l = 0, sc = 0;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) d++;
			else if(Character.isLetter(password.charAt(i))) l++;
			else sc++;
		}
		
		if(d == 0) {
			return false;
		}else if(l == 0) {
			return false;
		}else if(sc == 0) {
			return false;
		}
		
		return true;
	}
	public boolean isUsernameValid(String username) {
		if(username == null) return false;
		int len = username.length();
		if(len == 0) return false;
		if(len < 5 || len > 15) return false;
		for(int i = 0; i < username.length(); i++) {
			if(!Character.isLetterOrDigit(username.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean isPasswordValid(String password) {
		if(password == null) return false;
		int len = password.length();
		if(len == 0) return false;
		if(len < 8) return false;
		
		return isContain(password);
	}
	
	public String validateUsernameAnsPassword(String username, String password) {
		return isUsernameValid(username) && isPasswordValid(password) ? "Valid" : "Invalid";
	}
}

