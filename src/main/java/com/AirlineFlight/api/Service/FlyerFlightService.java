package com.AirlineFlight.api.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.FlyerFlightRepository;
import com.AirlineFlight.api.model.Flight;
import com.AirlineFlight.api.model.Flyer;
import com.AirlineFlight.api.model.FlyerFlight;

@Service
public class FlyerFlightService {
	
	@Autowired
	private FlyerFlightRepository flyerFlightRepository;
	

	public void assign(FlyerFlight flyerFlight) {
		// TODO Auto-generated method stub
		flyerFlightRepository.save(flyerFlight);
	}


	public List<FlyerFlight> getAllFlyerFlight() {
		// TODO Auto-generated method stub
		return flyerFlightRepository.findAll();
	}


	public Optional<FlyerFlight> getFlyerFlightById(int flyerflightId) {
		// TODO Auto-generated method stub
		Optional<FlyerFlight> optional = flyerFlightRepository.findById(flyerflightId);
		return optional;
	}
	
	public void deleteFlyerFlightById(int flyerflightId) {
		// TODO Auto-generated method stub
		flyerFlightRepository.deleteById(flyerflightId);
	}


	public List<Flight> getFlightByFlyerId(int flyerId) {
		// TODO Auto-generated method stub
		List<FlyerFlight> list= flyerFlightRepository.findAll();
	
		List<Flight> filteredlist= list.stream().filter(e->e.getFlyer().getId()==flyerId).map(e->e.getFlight())
				.collect(Collectors.toList());
		return filteredlist;
	}


	public List<Flyer> getFlyerByFlightId(int flightId) {
		// TODO Auto-generated method stub
		List<FlyerFlight> list = flyerFlightRepository.findAll();
		List<Flyer> filteredlist =    list.stream().filter(e->e.getFlight().getId()==flightId).map(e->e.getFlyer()).collect(Collectors.toList());
		return filteredlist;
	}


	

}
