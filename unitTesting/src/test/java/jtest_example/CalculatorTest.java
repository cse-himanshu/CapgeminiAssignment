package jtest_example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testTowandTwoGivesFour() {
		assertEquals(4, calculator.sum(2, 2));
	}
	@Test
	public void testFiveAndFourNine() {
		assertEquals(9, calculator.sum(5, 4));
	}
	
	
}
