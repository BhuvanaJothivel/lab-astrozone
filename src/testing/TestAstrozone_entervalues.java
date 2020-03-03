package testing;

import static org.junit.Assert.*;
import org.junit.Test;

import model.Astrozone_entervalues;

public class TestAstrozone_entervalues {
	Astrozone_entervalues astro = new Astrozone_entervalues("Clara","female","03-11-1997");
	@Test
	public void testGetNameMethod() {
		astro.setName("Clara");
		astro.setGender("Female");
		astro.setDob("03-11-1997");
		assertEquals("Clara", astro.getName());
		assertEquals("Female",astro.getGender());
		assertEquals("03-11-1997",astro.getDob());
		try {
			astro.setName(null);
			astro.setGender(null);
			astro.setDob(null);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
