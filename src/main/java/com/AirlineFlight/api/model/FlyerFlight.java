package com.AirlineFlight.api.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class FlyerFlight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	private Flight flight;

	@ManyToOne
	private Flyer flyer;
	
    @Column(name="departure_Date")
	private Date departureDate;
    
    @Column(name="couponUsed")
	private boolean CouponUsed;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Flyer getFlyer() {
		return flyer;
	}
	public void setFlyer(Flyer flyer) {
		this.flyer = flyer;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public boolean isCouponUsed() {
		return CouponUsed;
	}
	public void setCouponUsed(boolean couponUsed) {
		CouponUsed = couponUsed;
	}
	
	
	
	
}