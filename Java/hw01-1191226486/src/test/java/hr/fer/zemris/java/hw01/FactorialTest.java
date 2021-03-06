package hr.fer.zemris.java.hw01;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Razred koji sadrzi testove za provjeru metoda razreda {@link Factorial}
 */


public class FactorialTest {

	/**
	   * Test koji provjerava metodu calculateFactorial za brojeve u 
	   * dozvoljenom rasponu od 0 do 20
	   *
	   */
	
	
	@Test
	public void brojeviUDozvoljenomRasponu() {
		assertEquals(Factorial.calculateFactorial(1), 1);
		assertEquals(Factorial.calculateFactorial(5), 120);
		assertEquals(Factorial.calculateFactorial(15), 1307674368000L);
	}
	
	/**
	   * Test koji provjerava metodu calculateFactorial za rubne slucajeve
	   *
	   */
	
	@Test
	public void rubniSlucajevi() {
		assertEquals(Factorial.calculateFactorial(0), 1);
		assertEquals(Factorial.calculateFactorial(20), 2432902008176640000L);
	}
	
	
	/**
	   * Test koji provjerava metodu calculateFactorial za nedopustene brojeve
	   *
	   */
	

	@Test
	public void nedopusteniBrojevi() {
		assertEquals(Factorial.calculateFactorial(-1), -1);
		assertEquals(Factorial.calculateFactorial(21), -1);
	}
	
}
