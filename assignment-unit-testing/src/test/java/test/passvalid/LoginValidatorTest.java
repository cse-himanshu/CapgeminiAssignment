package test.passvalid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Login Validate Testing")
public class LoginValidatorTest {
	LoginValidator validator;

	@BeforeEach
	void setup() {
		validator = new LoginValidator();
	}
	
	@ParameterizedTest
	@CsvSource({
		"Username1,   1234@Password",
		"Username,    1@password",
		"User,        1@password",
		"'',          1@password",
		",            1@password"
	})
	void testWithCsv(String username, String password) {
		assertEquals("Valid", validator.validateUsernameAnsPassword(username, password));
	}

}
