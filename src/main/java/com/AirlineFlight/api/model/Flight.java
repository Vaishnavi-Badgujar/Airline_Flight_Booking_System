package com.AirlineFlight.api.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;

	public String flightName;

	public String departureCity;

	public String arrivalCity;

	public Date departureDate;

	public Flight() {

	}

<<<<<<< HEAD
	public Flight(int id, String flightName, String departureCity, String arrivalCity, Date departureDate,
			Executive executive, Airline airline) {
=======
	public Flight(int flightId, String flightName, String departureCity, String arrivalCity, Date departureDate) {
>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7
		super();
		this.id = id;
		this.flightName = flightName;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureDate = departureDate;
		this.executive = executive;
		this.airline = airline;
	}

	@ManyToOne
	private Executive executive;

	@ManyToOne
	private Airline airline;

	// Public Time departureTime




<<<<<<< HEAD
	
	
	
=======
	public int getFlightId() {
		return flightId;

	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7

	public String getFlightName() {
		return flightName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Executive getExecutive() {
		return executive;
	}

	public void setExecutive(Executive executive) {
		this.executive = executive;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

}