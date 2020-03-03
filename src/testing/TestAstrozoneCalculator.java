package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Astrozone_entervalues;
import service.AstrozoneCalculator;

public class TestAstrozoneCalculator {	
	AstrozoneCalculator astrocal = new AstrozoneCalculator();
	@Test
	public void testFindSignMethod() {
		Astrozone_entervalues astro = new Astrozone_entervalues("Clara","female","03-11-1997");
		assertEquals("Scorpio",astrocal.findSign(astro));
		Astrozone_entervalues astro1 = new Astrozone_entervalues("Clara","female","04-04-1969");
		assertEquals("Aries",astrocal.findSign(astro1));
		try {
			Astrozone_entervalues astro2 = new Astrozone_entervalues(null,null,null);
			astrocal.findSign(astro2);
			Astrozone_entervalues astro3 = new Astrozone_entervalues(null,"female","03-11-1997");
			astrocal.findSign(astro3);
			Astrozone_entervalues astro4 = new Astrozone_entervalues("Clara",null,"03-11-1997");
			astrocal.findSign(astro4);
			Astrozone_entervalues astro5 = new Astrozone_entervalues("Clara","female",null);
			astrocal.findSign(astro5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
