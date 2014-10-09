package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	
	private DecimalCollection dc;
	
	@Before
	public void before(){
		dc = new DecimalCollection();
		dc.add(1.0);
		dc.add(2.0);
	}

	@Test
	public void testSize() {
		assertEquals(2, dc.size());
	}

	@Test
	public void testSum() {
		assertEquals(3.0, dc.sum(),0);
	}

	@Test
	public void testHigher() {
		assertEquals(2.0, dc.higher(),0);
	}
	
	@Test
	public void testLower() {
	    assertEquals(1.0, dc.lower(), 0);
	}
}
