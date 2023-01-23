package com.AirlineFlight.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.FlightRepository;
import com.AirlineFlight.api.model.Flight;

@Service
public class FlightService {
	
	@Autowired
	private FlightRepository flightRepository;

	public void insertFlight(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.save(flight);
		
	}

	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}

	public Optional<Flight> getFlightById(int id) {
		// TODO Auto-generated method stub
		Optional<Flight> optional = flightRepository.findById(id);
		return optional;
	}

	public void updateFlightById(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.save(flight);
		
	}

	public void deleteFlightById(Flight flight) {
		// TODO Auto-generated method stub
		flightRepository.delete(flight);
		
	}

}
