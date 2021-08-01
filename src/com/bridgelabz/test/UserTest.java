package com.bridgelabz.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
	UserTest userTest = new UserTest();

	@Test
	void firstname() {
		String firstName = "Anil";
		assertTrue(userTest.firstname(firstName));

	}

	@Test
	void lastName() {
		String lastName = "Bali";
		assertTrue(userTest.lastName(lastName));
	}

	@Test
	void email() {
		String email = "bali39959@gmail.com";
		assertTrue(userTest.email(email));
	}

	@Test
	void mobile() {
		String mobile = "91 8217451010";
		assertTrue(userTest.mobile(mobile));
	}

	@Test
	void password() {
		String password = "Anil@2727";
		assertTrue(userTest.password(password));
	}
}
