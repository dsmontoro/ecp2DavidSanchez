package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User user;
	
	@Before
	public void before(){
		user = new User(1,"Sergio","Fernandez");
	}

	@Test
	public void testUser() {
		assertEquals(1, user.getNumber());
		assertEquals("Sergio", user.getName());
		assertEquals("Fernandez", user.getFamilyName()); 
	}

	@Test
	public void testGetNumber() {
		assertEquals(1, user.getNumber()); 
	}

	@Test
	public void testGetName() {
		assertEquals("Sergio", user.getName());
	}

	@Test
	public void testGetFamilyName() {
		assertEquals("Fernandez", user.getFamilyName());
	}

	@Test
	public void testFullName() {
		assertEquals("Sergio Fernandez", user.fullName());
	}

	@Test
	public void testInitials() {
		assertEquals("S.", user.initials());
	}
	
	@Test
	public void testNameUppercase() {
		assertEquals("SERGIO", user.nameUppercase());
	}

}
