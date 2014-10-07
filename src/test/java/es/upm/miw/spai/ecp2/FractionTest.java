package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	
	private Fraction fraction;
	
	@Before 
	public void before(){
		fraction = new Fraction(4,2);
	}

	@Test
	public void testFractionIntInt() {		
		assertEquals(4, fraction.getNumerator());
		assertEquals(2, fraction.getDenominator());
	}

	@Test
	public void testFraction() {
		Fraction fr = new Fraction();
		assertEquals(1, fr.getNumerator());
		assertEquals(1, fr.getDenominator());
	}

	@Test
	public void testGetNumerator() {
		assertEquals(4, fraction.getNumerator());
	}

	@Test
	public void testGetDenominator() {
		assertEquals(2, fraction.getDenominator());
	}

	@Test
	public void testDecimal() {
		assertEquals((double) 2, fraction.decimal());
	}

}
