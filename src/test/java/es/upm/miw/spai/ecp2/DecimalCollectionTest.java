package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	
	private DecimalCollection dc;
	
	@Before
	public void before(){
		dc = new DecimalCollection();
		dc.add((double) 1);
		dc.add((double) 2);
	}

	@Test
	public void testSize() {
		assertEquals(2, dc.size());
	}

	@Test
	public void testSum() {
		assertEquals(3, dc.sum());
	}

	@Test
	public void testHigher() {
		assertEquals((double)2, dc.higher());
	}

}
