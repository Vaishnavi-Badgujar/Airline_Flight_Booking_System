package com.AirlineFlight.api.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int flightId;

	public String flightName;

	public String departureCity;

	public String arrivalCity;

	public Date departureDate;
	
	// Public Time departureTime;
<<<<<<< HEAD
public Flight() {
=======
public Flight()
{
>>>>>>> 0337ad40e12f5eb6641d2b38e6630add76590f5f
	
}

	public Flight(int flightId, String flightName, String departureCity, String arrivalCity, Date departureDate) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.departureDate = departureDate;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
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

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", departureCity=" + departureCity
				+ ", arrivalCity=" + arrivalCity + ", departureDate=" + departureDate + "]";
	}

	
}
