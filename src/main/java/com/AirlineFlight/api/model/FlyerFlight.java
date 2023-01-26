package com.AirlineFlight.api.model;

import java.util.Date;

import javax.persistence.Column;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Enumerated(EnumType.STRING)
	private TicketStatus status;

	@ManyToOne
	private Flight flight;

	@ManyToOne
	private Flyer flyer;

<<<<<<< HEAD
	@Column(name = "departure_Date")
	private Date departureDate;

	@Column(name = "couponUsed")
	private boolean CouponUsed;

=======
	private int flightId;
	private int flyerId;
	private Date departureDate;
	private boolean CouponUsed;

	public FlyerFlight(int id, Flight flight, Flyer flyer, int flightId, int flyerId, Date departureDate,
			boolean couponUsed) {
		super();
		this.id = id;
		this.flight = flight;
		this.flyer = flyer;
		this.flightId = flightId;
		this.flyerId = flyerId;
		this.departureDate = departureDate;
		CouponUsed = couponUsed;
	}

>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7
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

<<<<<<< HEAD
=======
	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getFlyerId() {
		return flyerId;
	}

	public void setFlyerId(int flyerId) {
		this.flyerId = flyerId;
	}

>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7
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

<<<<<<< HEAD
	public TicketStatus getStatus() {

		return status;
	}

	public void setStatus(TicketStatus status) {
		this.status = status;
	}

=======
>>>>>>> 53a23c4f7246003ec00b109c2a4aac7fb978cfe7
}