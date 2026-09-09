package calculatorJunit;

public class Calculator {

	public int sum(int x, int y) {
		return x + y;
	}

	public int division(int x, int y) {
		return x / y;
	}

	public boolean checkNumbersIsPair(int number) {
		return number % 2 == 0;
	}
}
