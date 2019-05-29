package Calculator.Calculator;

/**
 * @author Gustaf Cavalli
 *
 */
public class CalculatorBasicOperations implements CalculatorBasicOperationsInterface{

	/**
	 * Adderar num1 med num2 och returnar en int med resultatet.
	 * 
	 * @param num1, num2
	 * de två numren som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public int plus(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	/**
	 * Subtraherar num1 med num2 och returnar en int med resultatet.
	 * 
	 * @param num1, num2
	 * de två numren som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public int minus(int num1, int num2) {
		int result = num1 - num2;
		return result;
	}
	/**
	 * Multiplicerar num1, num2 och returnar en int med resultatet.
	 * 
	 * @param num1 med num2
	 * de två numren som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public int mult(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}
	/**
	 * Dividerar num1 med num2 och returnar en double med resultatet.
	 * 
	 * @param num1, num2
	 * de två numren som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double div(double num1, double num2) {
		double result = num1 / num2;
		return result;
	}

}
