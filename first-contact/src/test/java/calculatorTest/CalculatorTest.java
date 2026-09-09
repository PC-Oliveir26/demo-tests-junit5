package calculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculatorJunit.Calculator;

public class CalculatorTest {
//	Calculator calculator = new Calculator();

	@Test
	public void sumTwoNumbers() {
		Calculator calculator = new Calculator();
		int sum = calculator.sum(20, 30);
		Assertions.assertEquals(50, sum);
	}

	@Test
	public void CheckNumbersIsPair() {
		Calculator calculator = new Calculator();
		boolean result = calculator.checkNumbersIsPair(6);
		Assertions.assertTrue(result);
	}

}
