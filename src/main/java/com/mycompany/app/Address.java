package com.mycompany.app;

/**
 * A simple class for an Address
 *
 * @author Linda M Roseberry
 */

public class Address {

	private String street;
	private String city;
	private String state;
	private String zip;

    /**
     * Creates a new Address instance.
     *
     * @param street street number and name
     * @param city city name
	 * @param state state alpha abbreviation
	 * @param zip zip code 
     */
    public Address(String street, String city, String state, String zip) {
        this.street = street;
		this.city=city;
		this.state = state;
		this.zip = zip;
    }

    /**
     * @returns the street 
     */
    public String getStreet() {
        return street;
    }

    /**
     * @returns the city
     */
    public String getCity() {
        return city;
    }

	/**
     * @returns the state
     */
    public String getState() {
        return state;
    }
	
	/**
     * @returns the zip
     */
    public String getZip() {
        return zip;
    }
}