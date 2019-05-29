package Calculator.Calculator;

/**
 * 
 * @author Gustaf Cavalli
 *
 */
public class CalculatorAdvancedOperations implements CalculatorAdvancedOperationsInterface{

	/**
	 * Tar roten ur double num och returnar en double med resultatet.
	 * 
	 * @param num
	 * numret som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double roten(double num) {
		double result = Math.sqrt(num);
		return result;
	}
	/**
	 * Gångrar double num med sig själv och returnar en double med resultatet.
	 * 
	 * @param num
	 * numret som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double kvadrat(double num) {
		double result = num * num;
		return result;
	}
	/**
	 * Räknar sinus double num och returnar en double med resultatet.
	 * 
	 * @param num
	 * numret som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double sinus(double num) {
		double result = Math.sin(num);
		return result;
	}
	/**
	 * Räknar cosinus double num och returnar en double med resultatet.
	 * 
	 * @param num
	 * numret som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double cosinus(double num) {
		double result = Math.cos(num);
		return result;
	}
	/**
	 * Räknar tangens double num och returnar en double med resultatet.
	 * 
	 * @param num
	 * numret som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double tangens(double num) {
		double result = Math.tan(num);
		return result;
	}
	/**
	 * Räknar logaritmen av double num och returnar en double med resultatet.
	 * 
	 * @param num
	 * numret som ska beräknas
	 * 
	 * @param result
	 * Resultatet som skickas tillbaka.
	 * 
	 */
	public double logaritm(double num) {
		double result = Math.log(num);
		return result;
	}

}
