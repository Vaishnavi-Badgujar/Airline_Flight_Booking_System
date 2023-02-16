package com.AirlineFlight.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Flyer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String firstName;

	private String lastName;

	private String middleName;

	private String email;

	private String phone;
	
	

	

	@OneToOne
	private User user;

	@ManyToOne
	private Airline airline;

//	@ManyToMany
//	private List<Flight> flights;

//	public List<Flight> getFlights() {
//		return flights;
//	}

//	public void setFlights(List<Flight> flights) {
//		this.flights = flights;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
	@Override
	public String toString() {

		return "Flyer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="

				+ middleName + ", email=" + email + ", phone=" + phone + "]";
	}

}
