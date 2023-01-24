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

	@Column(name="flight_Name")
	public String flightName;

	@Column(name="departure_City")
	public String departureCity;
	
    @Column(name="arrival_City")
	public String arrivalCity;
    
    @Column(name="departure_Date")
	public Date departureDate;
<<<<<<< HEAD
    
    @Column(name="flight_Id")
    public String flightId;
    
    @ManyToOne
    private Executive executive;
    
    @ManyToOne
    private Airline airline;
=======
	
	// Public Time departureTime;

public Flight()
{

	
}
>>>>>>> 9446f0b28d9540cdfa1058974ee8f6b938658221

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	
    
	

}