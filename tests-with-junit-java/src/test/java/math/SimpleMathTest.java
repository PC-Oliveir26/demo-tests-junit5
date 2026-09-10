package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		Double firstNumber = 35D;
		Double secondNumber = 10D;
		Double actual = math.sum(firstNumber, secondNumber);
		Double expected = 45D;

		assertEquals(expected, actual, () -> 
						firstNumber + 
						" + " +
						secondNumber +
						"did not produce " +
						expected +
						" !"
						);
		assertNotEquals(5.5, actual);
		assertNotNull(actual);

	}

	@Test
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		Double actual = math.subtraction(35D, 10D);
		Assertions.assertEquals(25, actual);
	}

	@Test
	void testDivision() {
		SimpleMath math = new SimpleMath();
		Double actual = math.division(10D, 2D);
		Assertions.assertEquals(5, actual);

	}

	@Test
	void testMulplication() {
		SimpleMath math = new SimpleMath();
		Double actual = math.multiplication(5D, 2D);
		Assertions.assertEquals(10, actual);
	}

}
