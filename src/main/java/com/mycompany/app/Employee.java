package com.mycompany.app;

/**
 * A simple class for an Employee
 *
 * @author Linda M Roseberry
 */

public class Employee {

	private int id;
	private String firstName;
    private String lastName;
    private Address address;
	private int salary;

    /**
     * Creates a new Employee instance.
     *
     * @param id the employee number of the employee
     * @param firstName the first name of the employee
	 * @param lastName the last name of the employee
	 * @param address the street, city, state, and zip code of the employee
	 * @param salary the annual salary of the employee
     */
    public Employee(int id, String firstName, String lastName, Address address, int salary) {
        this.id = id;
        this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.salary = salary;
    }

    /**
     * @returns the employee's id
     */
    public int getId() {
        return id;
    }

    /**
     * @returns the employee's first name
     */
    public String getFirstName() {
        return firstName;
    }

	/**
     * @returns the employee's last name
     */
    public String getLastName() {
        return lastName;
    }
	
	/**
     * @returns the employee's address
     */
    public Address getAddress() {
        return address;
    }
	
	/**
     * @returns the employee's salary
     */
    public int getSalary() {
        return salary;
    }
	
    /**
	* @param id the employee number of the employee
    * @param firstName the first name of the employee
	* @param lastName the last name of the employee
	* @param address the street, city, state, and zip code of the employee
    * @returns string containing the employee info
    */
    public String display(int id, String firstName, String lastName, Address address) {
		String street = address.getStreet();
		String city = address.getCity();
		String state = address.getState();
		String zip = address.getZip();
		String empInfo = "Id: " + id + ", Name: " + firstName + " " + lastName + ", Address: " + street + ", " + city + ", " + state + " " + zip;  
        return empInfo;

    }
/**
     * @param salary the annual salary of the employee
     * @returns true if employee's annual salary is greater than or equal to $100,000 
     */
    public boolean isHighlyPaid(int salary) {
		if (salary >= 100000) {
			return true;
		} else {
			return false; }
    }
}