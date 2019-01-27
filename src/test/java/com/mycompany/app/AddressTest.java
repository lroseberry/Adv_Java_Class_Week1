package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the Address class
 *
 * @author Linda M Roseberry
 */
public class AddressTest {

	private String street;
	private String city;
	private String state;
	private String zip;

    @Before
    public void setup() {  
		street = "123 Main Street";
		city = "Worcester";
		state = "MA";
		zip = "01653";
    }

	@Test
	public void testAddressConstruction() {
		Address address = new Address(street, city, state, zip);
		assertEquals("The street is correct", address.getStreet(), street);
        assertEquals("The city is correct", address.getCity(), city);
		assertEquals("The state is correct", address.getState(), state);
		assertEquals("the zip code is correct", address.getZip(), zip);
	}
}
