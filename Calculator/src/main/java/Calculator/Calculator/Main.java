package Calculator.Calculator;
import java.util.Scanner;

/**
 * @author Gustaf Cavalli
 *
 *Programmet frågar först vilken typ av uträkning du vill göra. Sen använder den sig 
 *utav objekt från andra classer för att göra beräkningar.
 */
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CalculatorBasicOperations simpleMatte = new CalculatorBasicOperations();
		CalculatorAdvancedOperations avanceradMatte = new CalculatorAdvancedOperations();
		int num1 = 0;
		int num2 = 0;
		System.out.println("Välkommen till min miniräknare!");
		System.out.println("Vilken sorts uträkning vill du göra?");
		System.out.println("1. Plus\n2. Minus\n3. Multiplikation \n4. Division\n5. Avancerade ");
		int val = input.nextInt();
		
		// Simpel matte
		
			if(val == 1){
				System.out.println("Skriv det första talet!");
				num1 = input.nextInt();
				System.out.println("Skriv det andra talet!");
				num2 = input.nextInt();
				int result = simpleMatte.plus(num1, num2);
				System.out.println("Resultatet blev " + result);
			}
			
			if(val == 2){
				System.out.println("Skriv det första talet!");
				num1 = input.nextInt();
				System.out.println("Skriv det andra talet!");
				num2 = input.nextInt();
				int result = simpleMatte.minus(num1, num2);
				System.out.println("Resultatet blev " + result);
			}
			
			if(val == 3){
				System.out.println("Skriv det första talet!");
				num1 = input.nextInt();
				System.out.println("Skriv det andra talet!");
				num2 = input.nextInt();
				int result = simpleMatte.mult(num1, num2);
				System.out.println("Resultatet blev " + result);
			}
			
			if(val == 4){
				System.out.println("Skriv det första talet!");
				num1 = input.nextInt();
				System.out.println("Skriv det andra talet!");
				num2 = input.nextInt();
				double result = simpleMatte.div(num1, num2);
				System.out.println("Resultatet blev " + result);
			}
			
			if(val == 5){
				System.out.println("1. Roten\n2. Kvadrat\n3. Sinus \n4. Cosinus\n5. Tangens\n6. Logaritm ");
				int val2 = input.nextInt();
				
				if(val2 == 1){
					System.out.println("Skriv in ditt nummer");
					double num3 = input.nextInt();
					double resultDouble = avanceradMatte.roten(num3);
					System.out.println("Resultatet blev " + resultDouble);
				}
				if(val2 == 2){
					System.out.println("Skriv in ditt nummer");
					double num3 = input.nextInt();
					double resultDouble = avanceradMatte.kvadrat(num3);
					System.out.println("Resultatet blev " + resultDouble);
				}
				if(val2 == 3){
					System.out.println("Skriv in ditt nummer");
					double num3 = input.nextInt();
					double resultDouble = avanceradMatte.sinus(num3);
					System.out.println("Resultatet blev " + resultDouble);
				}
				if(val2 == 4){
					System.out.println("Skriv in ditt nummer");
					double num3 = input.nextInt();
					double resultDouble = avanceradMatte.cosinus(num3);
					System.out.println("Resultatet blev " + resultDouble);
				}
				if(val2 == 5){
					System.out.println("Skriv in ditt nummer");
					double num3 = input.nextInt();
					double resultDouble = avanceradMatte.tangens(num3);
					System.out.println("Resultatet blev " + resultDouble);
				}
				if(val2 == 6){
					System.out.println("Skriv in ditt nummer");
					double num3 = input.nextInt();
					double resultDouble = avanceradMatte.logaritm(num3);
					System.out.println("Resultatet blev " + resultDouble);
				}
			}
			
			input.close();
	}

}
