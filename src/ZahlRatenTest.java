import static org.junit.Assert.*;

import org.junit.Test;

public class ZahlRatenTest {

	@Test
	public void zahlWuerfelnInBereich() {
		ZahlRaten spiel = new ZahlRaten();
		
		int min = 50;
		int max = 50;
		
		int gewuerfelt = spiel.zahlWuerfeln(min, max);
		
		assertEquals("Gewuerfelt wurde nicht 50, sondern "+ Integer.toString(gewuerfelt) + "!",50, gewuerfelt);
	}

}
