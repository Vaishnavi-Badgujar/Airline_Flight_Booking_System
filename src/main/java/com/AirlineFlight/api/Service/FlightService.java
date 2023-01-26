package com.AirlineFlight.api.Service;


import java.util.Optional;
import java.util.stream.Collectors;

import com.AirlineFlight.api.model.Flight;


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
		
		flightRepository.save(flight);
		
	}

	public List<Flight> getAllFlight() {
		
		return flightRepository.findAll();
	}

	public Optional<Flight> getFlightById(int id) {
	
		Optional<Flight> optional = flightRepository.findById(id);
		return optional;
	}

	public void updateFlightById(Flight flight) {
		
		flightRepository.save(flight);
		
	}

	public void deleteFlightById(Flight flight) {
	
		flightRepository.delete(flight);
		
	}
	
	public List<Flight> getFlightByAirlineId(int aid) {
		// Fetch all flights from the DB 
		 List<Flight> list = flightRepository.findAll();
		 List<Flight> filteredList = list.stream().filter(e->e.getAirline().getId() == aid).collect(Collectors.toList());
		 return filteredList;
   }
	//Fetch flight by departureCity & arrivalCity
	public List<Flight> getFlightByDepartureCityAndArrivalCity(String departureCity, String arrivalCity){
		List<Flight> list = flightRepository.findAll();
		List<Flight> filteredList = list.stream().filter(e->e.getDepartureCity().equals(departureCity)).filter(e->e.getArrivalCity().equals(arrivalCity)).collect(Collectors.toList());
		return filteredList;
	}	
	
	 //fetch flight by flightName
	public List<Flight> getFlightByFlightName(String fname) {
		List<Flight> list = flightRepository.findAll();
		List<Flight> filteredList =
				list.stream()
				.filter(e->e.getFlightName().equals(fname))
				.collect(Collectors.toList());
		return filteredList;
		}
	
	
    	

	

}
