package Calculator.Calculator;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class TestDiv {
	CalculatorBasicOperations simpleMatte = new CalculatorBasicOperations();
	Random rand = new Random();
	double random1;
	double random2;
	double resultat;
	double metodResultat;
	public static final Logger Log = Logger.getLogger(CalculatorBasicOperations.class.getName());
	@Test
	public void test() {
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100);
			random2 = rand.nextInt(100);
			resultat = random1 / random2;
			metodResultat = simpleMatte.div(random1, random2);
			assertEquals(metodResultat, resultat, 0.0001);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100) * -1;
			random2 = rand.nextInt(100);
			resultat = random1 / random2;
			metodResultat = simpleMatte.div(random1, random2);
			assertEquals(metodResultat, resultat, 0.0001);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
		for(int i=0; i<50; i++){
			random2 = rand.nextInt(100);
			random1 = 0;
			resultat = random1 / random2;
			metodResultat = simpleMatte.div(random1, random2);
			assertEquals(metodResultat, resultat, 0.0001);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
	}

}