package com.AirlineFlight.api.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.AirlineRepository;
import com.AirlineFlight.api.model.Airline;

@Service
public class AirlineService {
	
	@Autowired
	private AirlineRepository airlineRepository;

	 public void insertAirline(Airline airline) {
		 airlineRepository.save(airline);
		// TODO Auto-generated method stub
		
	 }

	 public List<Airline> getAllAirlines() {
		// TODO Auto-generated method stub
		 return airlineRepository.findAll();
	 }

	 public Optional<Airline> getAirlineById(int aid) {
		 Optional<Airline> optional = airlineRepository.findById(aid);
		 if(optional!= null)
			 return optional;
		 
	
		return null;
	 }
	 
	 public void updateAirlineById(Airline airline) {
		 airlineRepository.save(airline);
			// TODO Auto-generated method stub
			
		}




	 public void deleteAirlineById(Airline airline) {
		 airlineRepository.delete(airline);
		// TODO Auto-generated method stub
		
	 }


	
}
