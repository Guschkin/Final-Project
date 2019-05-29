package Calculator.Calculator;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class TestRoten {
	CalculatorAdvancedOperations avanceradMatte = new CalculatorAdvancedOperations();
	Random rand = new Random();
	double random1;
	double resultat;
	double metodResultat;
	public static final Logger Log = Logger.getLogger(CalculatorBasicOperations.class.getName());
	@Test
	public void test() {
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100);
			resultat = Math.sqrt(random1);
			metodResultat = avanceradMatte.roten(random1);
			assertEquals(metodResultat, resultat, 0.0001);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100) * -1;
			resultat = Math.sqrt(random1);
			metodResultat = avanceradMatte.roten(random1);
			assertEquals(metodResultat, resultat, 0.0001);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
		for(int i=0; i<50; i++){
			random1 = 0;
			resultat = Math.sqrt(random1);
			metodResultat = avanceradMatte.roten(random1);
			assertEquals(metodResultat, resultat, 0.0001);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
	}

}