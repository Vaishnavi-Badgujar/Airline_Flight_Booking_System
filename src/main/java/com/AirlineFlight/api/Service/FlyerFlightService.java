package com.AirlineFlight.api.Service;

import java.util.ArrayList;
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
		flyerFlightRepository.save(flyerFlight);
		
	}

	public List<FlyerFlight> getAllFlyerFlight() {
		// TODO Auto-generated method stub
	
		return  flyerFlightRepository.findAll();
		
	}

	public Optional<FlyerFlight> getFlyerFlightById(int flyerflightId) {
		// TODO Auto-generated method stub
		Optional<FlyerFlight> optional = flyerFlightRepository.findById(flyerflightId);
		return optional;
	}

	public List<Flyer> getFlyerByFlightId(int flyerflightId) {
		// TODO Auto-generated method stub
		List<FlyerFlight> list = flyerFlightRepository.findAll();
		List<Flyer>filteredList = list.stream().filter(e->e.getFlight().getId()==flyerflightId).map(e->e.getFlyer()).collect(Collectors.toList());
		return filteredList;
		
	}

	public void deleteFlyerFlightById(int flyerflightId) {
		// TODO Auto-generated method stub
		flyerFlightRepository.deleteById(flyerflightId);
	}

	public List<Flight> getFlightByFlyerId(int flyerflightId) {
		// TODO Auto-generated method stub
List<FlyerFlight> list = flyerFlightRepository.findAll();
List<Flight> filteredlist=list.stream().filter(e->e.getFlyer().getId()==flyerflightId).map(e->e.getFlight()).collect(Collectors.toList());
return filteredlist;
	}	
	
}

