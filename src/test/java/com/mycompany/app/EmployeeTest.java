package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit tests for the Employee class
 *
 * @author Linda M Roseberry
 */
public class EmployeeTest {

	private int id;
	private String firstName;
	private String lastName; 
    private Address address;
	private String street;
	private String city;
	private String state;
	private String zip;
	private int salary;

    @Before
    public void setup() {  
		id = 1;
		firstName = "Linda";
		lastName = "Roseberry";
		street = "123 Main Street";
		city = "Worcester";
		state = "MA";
		zip = "01653";
		address = new Address (street, city, state, zip);
		salary = 120000;
    }

	@Test
	public void testEmployeeConstruction() {
		Employee employee = new Employee(id, firstName, lastName, address, salary);
		assertEquals("The id is correct", employee.getId(), id);
        assertEquals("The first name is correct", employee.getFirstName(), firstName);
		assertEquals("The last name is correct", employee.getLastName(), lastName);
		assertEquals("The address is correct", employee.getAddress(), address);
		assertEquals("The salary is correct", employee.getSalary(), salary);
	}
	
	@Test 
	public void testDisplayPositive() {
		String expected = "Id: 1, Name: Linda Roseberry, Address: 123 Main Street, Worcester, MA 01653";  
		Employee employee = new Employee(id, firstName, lastName, address, salary);
		String result = employee.display(id, firstName, lastName, address);
		assertEquals("The returned string is correct", result, expected);
	}
	
	@Test 
	public void testDisplayNegative() {
		String expected = "Id: 2, Name: John Roseberry, Address: 123 Main Street, Worcester, MA 01653";  
		Employee employee = new Employee(id, firstName, lastName, address, salary);
		String result = employee.display(id, firstName, lastName, address);
		assertTrue("The returned string is correct", result != expected);
	}

	@Test
	public void testIsHighlyPaidPositive() {
		Employee employee = new Employee(id, firstName, lastName, address, salary);
		assertTrue("The employee is considered highly paid", employee.isHighlyPaid(salary));
	}
	@Test
	public void testIsHighlyPaidNegative() {
		salary = 90000;
		Employee employee = new Employee(id, firstName, lastName, address, salary);
		assertFalse("The employee is not considered highly paid", employee.isHighlyPaid(salary));
	}
}
