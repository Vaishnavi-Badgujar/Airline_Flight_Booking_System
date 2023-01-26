package com.AirlineFlight.api.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
=======
>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7

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

<<<<<<< HEAD
	@OneToOne
	private User user;

	
	@ManyToOne
	private Airline airline;
	
	
	@ManyToMany
	private List<Flight> flights;

	
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

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
=======
	public int getFlyerId() {
		return flyerId;
	}

	public void setFlyerId(int flyerId) {
		this.flyerId = flyerId;
>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
<<<<<<< HEAD
		return "Flyer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
=======
		return "Flyer [flyerId=" + flyerId + ", firstName=" + firstName + ", lastName=" + lastName + ", middleName="
>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7
				+ middleName + ", email=" + email + ", phone=" + phone + "]";
	}

}
