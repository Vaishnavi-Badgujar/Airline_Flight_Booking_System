package com.AirlineFlight.api.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.Airline.Flight.api.enums.TicketStatus;

@Entity
public class Executive {
	
	
	@Enumerated(EnumType.STRING)
	private TicketStatus ticketStatus;
	

	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	
	

}
