package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User user;
	
	@Before
	public void before(){
		user = new User(1,"Sergio","Fernandez Alvarez");
	}

	@Test
	public void testUser() {
		assertEquals(1, user.GetNumber());
		assertEquals("Sergio", user.GetName());
		assertEquals("Fernandez Alvarez", user.GetFamilyName()); 
	}

	@Test
	public void testGetNumber() {
		assertEquals(1, user.GetNumber()); 
	}

	@Test
	public void testGetName() {
		assertEquals("Sergio", user.GetName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Fernandez Alvarez", user.GetFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Sergio Fernandez Alvarez", user.GetFullName());
	}

	@Test
	public void testInitials() {
		assertEquals("S.F.A", user.initials());
	}

}
