package com.AirlineFlight.api.Service;


import java.util.Optional;
import java.util.stream.Collectors;

import com.AirlineFlight.api.model.Flight;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.FlightRepository;

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
	
	
    	

	
	//Buisness API getFlightByAirlineId
	
	public List<Flight> getFlightByAirlineId(int aid) {
		// Fetch all flights from DB using AirlineId
		List<Flight> list = flightRepository.findAll();
		List<Flight> filteredList = 
				list.stream()
					.filter(e->e.getAirline().getId() == aid)
						.collect(Collectors.toList());
		return filteredList;
	}
	
	
	
	public List<Flight> getFlightByDepartureCityAndArrivalCity(String departureCity, String arrivalCity){
	 //Fetch Flights from DB using DepartureCity and ArrivalCity
		 List<Flight> list = flightRepository.findAll();
		 List<Flight> filteredList =
				list.stream().filter(e->e.getDepartureCity().equals(departureCity))
								.filter(e->e.getArrivalCity().equals(arrivalCity))
								.collect(Collectors.toList());
		 return filteredList;
		  }

	
	//Buisness API getFlightByDepartureAndArrivalAndDepartureDate
	
	public List<Flight> getFlightByDepartureAndArrivalAndDepartureDate(String departureCity, String arrivalCity,
			Date departureDate) {
		// Fetch flight from DB using departureId, arrivalId & departureDate
		List<Flight> list = flightRepository.findAll();
		List<Flight> filteredList = 
				list.stream()
					.filter(e->e.getDepartureCity().equals(departureCity))
					.filter(e->e.getArrivalCity().equals(arrivalCity))
					.filter(e->e.getDepartureDate().equals(departureDate))
					.collect(Collectors.toList());
		return filteredList;
	}
	
	
		public List<Flight> getFlightByAirlineName(String AName) {
			//fetch flight by AirlineName
			List<Flight> list = flightRepository.findAll();
			List<Flight> filteredList = list.stream().filter(e->e.getFlightName().equals(AName))
					.collect(Collectors.toList());
			return filteredList;
		}
		
		

//		public List<Flight> getFlightByFlyerId(int flyerId) {
//			// Fetch flight by FlyerId
//			List<Flight> list = flightRepository.findAll();
//			List<Flight> filteredList = list.stream().filter(e->e.getFlyerId().equals(flyerId))
//					.collect(Collectors.toList());
//			return filteredList;
//		}

}



