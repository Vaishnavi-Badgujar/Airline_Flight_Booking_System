package com.AirlineFlight.api.model;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.Airline.Flight.api.enums.TicketStatus;

@Entity
public class FlyerFlight {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Flight flight;
	
	@ManyToOne
	private Flyer flyer;
	@Enumerated(EnumType.STRING)
	private TicketStatus status;
	
	
	private boolean couponUsed;
	
	private Date departureDate;
	
	public FlyerFlight() {
	}
	


	public FlyerFlight(int id, Flight flight, Flyer flyer, boolean couponUsed,
			Date departureDate) {
		super();
		this.id = id;
		this.flight = flight;
		this.flyer = flyer;
		this.status = status;
		this.couponUsed = couponUsed;
		this.departureDate = departureDate;
	}



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

	public boolean isCouponUsed() {
		return couponUsed;
	}

	public TicketStatus getStatus() {
		return status;
	}



public void setStatus(TicketStatus status) {
	this.status = status;
}



	public void setCouponUsed(boolean couponUsed) {
		this.couponUsed = couponUsed;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	@Override
	public String toString() {
		return "FlyerFlight [id=" + id + ", flight=" + flight + ", flyer=" + flyer + ", couponUsed=" + couponUsed
				+ ", departureDate=" + departureDate + "]";
	}
	
	

}

	
	

	

	

	

	

	