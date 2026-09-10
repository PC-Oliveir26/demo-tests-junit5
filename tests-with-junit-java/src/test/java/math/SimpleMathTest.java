package math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void testSum() {
		SimpleMath math = new SimpleMath();
		Double actual = math.sum(35.0, 10.0);
		Assertions.assertEquals(45, actual);
//		System.out.print(actual);
	}
	
	@Test 
	void testSubtraction() {
		SimpleMath math = new SimpleMath();
		Double actual = math.subtraction(35.0, 10.0);
		Assertions.assertEquals(25, actual);
	}
	
	@Test
	void testDivision() {
		SimpleMath math = new SimpleMath();
		Double actual = math.division(10.0, 2.0);
		Assertions.assertEquals(5, actual);
		
	}
	@Test
	void testMulplication() {
		SimpleMath math = new SimpleMath();
		Double actual = math.multiplication(5.0, 2.0);
		Assertions.assertEquals(10, actual);}

}
