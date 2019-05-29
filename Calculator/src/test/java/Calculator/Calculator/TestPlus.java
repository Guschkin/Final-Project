package Calculator.Calculator;

import static org.junit.Assert.*;
import java.util.Random;
import java.util.logging.Logger;
import org.junit.Test;

public class TestPlus {
	CalculatorBasicOperations simpleMatte = new CalculatorBasicOperations();
	Random rand = new Random();
	int random1;
	int random2;
	int resultat;
	int metodResultat;
	public static final Logger Log = Logger.getLogger(CalculatorBasicOperations.class.getName());
	@Test
	public void test() {
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100);
			random2 = rand.nextInt(100);
			resultat = random1 + random2;
			metodResultat = simpleMatte.plus(random1, random2);
			assertEquals(metodResultat, resultat);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100) * -1;
			random2 = rand.nextInt(100);
			resultat = random1 + random2;
			metodResultat = simpleMatte.plus(random1, random2);
			assertEquals(metodResultat, resultat);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
		for(int i=0; i<50; i++){
			random1 = rand.nextInt(100);
			random2 = 0;
			resultat = random1 + random2;
			metodResultat = simpleMatte.plus(random1, random2);
			assertEquals(metodResultat, resultat);
			Log.info("Results:" + metodResultat + " = " + resultat + "\n");
		}
	}

}
