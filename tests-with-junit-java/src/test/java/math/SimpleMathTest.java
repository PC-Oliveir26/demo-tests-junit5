package math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Math Operations in SimpleMath Class")
class SimpleMathTest {

	SimpleMath math = new SimpleMath();
	String message = "didn't expected";

	@Test
	@DisplayName("Test 35 + 10 = 45")
	void testSum_When_ThintyFiveIsAddedByTen_ShouldReturnFortyFive() {
		Double actual = math.sum(35D, 10D);
		assertEquals(45, actual, () -> message);
	}

	@Test
	@DisplayName("35 - 10 = 25")
	void testSubtraction_When_ThintyFiveSubtractedByTen_ShouldReturnTwentyFive() {
		Double actual = math.subtraction(35D, 10D);
		Assertions.assertEquals(25, actual, () -> message);
	}

	@Test
	@DisplayName("10 / 2 = 5")
	void testDivision_When_TenDividedByTwo_ShouldReturnFive() {
		Double actual = math.division(10D, 2D);
		Assertions.assertEquals(5, actual, () -> message);
	}

	@Test
	@DisplayName("5 * 2 = 12")
	void testMulplication_When_FiveMultipliedByTwo_ShouldReturnTen() {
		Double actual = math.multiplication(5D, 2D);
		Assertions.assertEquals(10, actual, () -> message);
	}

	@Test
	@DisplayName("(10 + 10) / 2 = 10")
	void testMean() {
		Double actual = math.mean(10D, 10D);
		Assertions.assertEquals(10, actual);
	}

	@Test
	@DisplayName("Test Square Root of 144 = 12")
	void testSquareRoot() {
		Double actual = math.squareRoot(144D);
		Assertions.assertEquals(12, actual);
	}
	
//	Default:
//	test[System Under Test]_[Condition or Stage Change]_[Expected Resume]
}