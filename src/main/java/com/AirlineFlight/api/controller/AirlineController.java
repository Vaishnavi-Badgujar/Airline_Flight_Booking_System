package com.AirlineFlight.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AirlineFlight.api.Service.AirlineService;
import com.AirlineFlight.api.model.Airline;

@RestController
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	
	// Airline POST API 
	@PostMapping("/api/airline/add")
	public ResponseEntity<String> postAirline(@RequestBody Airline airline) {
		airlineService.insertAirline(airline);
		return ResponseEntity.status(HttpStatus.OK).body("Airline added in DB");
	}
	
	//GetAll API
	@GetMapping("/api/airline/getall")
	public List<Airline> getAllAirlines(){
		List<Airline> list = airlineService.getAllAirlines();
		return list;
		
	}
	
	//GetById API
	@GetMapping("/api/airline/one/{id}")
	public ResponseEntity<Object> getAirlineById(@PathVariable("id") int id) {
		Optional<Airline> optional = airlineService.getAirlineById(id);
		if (optional == null)
			return ResponseEntity.status(HttpStatus.OK).body("Invalid ID Given");
		
		Airline airline = optional.get();
		return ResponseEntity.status(HttpStatus.OK).body(airline);
		
	}
	
	//PUT API
	@PutMapping("/api/airline/one/{id}")
	public  ResponseEntity<String> updateAirlineById(@PathVariable("id") int id,@RequestBody Airline airline) {
		airlineService.updateAirlineById(airline);
		return ResponseEntity.status(HttpStatus.OK).body("Airline is Updated");
		
	}
	
	//DELETE APi
	@DeleteMapping("/api/airline/{id}")
	public ResponseEntity<String> deleteAirlineById(@PathVariable("id") int id,@RequestBody Airline airline){
		airlineService.deleteAirlineById(airline);
		return ResponseEntity.status(HttpStatus.OK).body("Airline is Deleted");
	}
	

}
