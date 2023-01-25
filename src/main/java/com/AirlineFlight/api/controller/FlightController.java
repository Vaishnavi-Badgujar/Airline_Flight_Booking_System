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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.AirlineFlight.api.Service.AirlineService;
//import com.AirlineFlight.api.Service.ExecutiveService;
import com.AirlineFlight.api.Service.FlightService;
import com.AirlineFlight.api.model.Flight;

@RestController
@RequestMapping("/api/flight")
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	//@Autowired
	//private ExecutiveService executiveService;
	
//	@Autowired
//	private AirlineService airlineService;
//	
	// Flight POST API
	
	@PostMapping("/add")
	public ResponseEntity<String> postFlight(@RequestBody Flight flight) {
		flightService.insertFlight(flight);
		return ResponseEntity.status(HttpStatus.OK).body("Flight Posted in DB");
		
	}
	
	// Flight ADD API
	
	@GetMapping("/getall")
	public List<Flight> getAllFlight(){
		List<Flight> list = flightService.getAllFlight();
		return list;
	}
	
	// Get Flight by ID
	
	@GetMapping("/one/{flightId}")
	public ResponseEntity<Object> getFlightById(@PathVariable("flightId") int flightId) {
		Optional<Flight> optional = flightService.getFlightById(flightId);
		if (!optional.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ID given");
		
		Flight flight = optional.get();
		return ResponseEntity.status(HttpStatus.OK).body(flight);
	}

	
	//put Flight API
	
	@PutMapping("/one/{flightId}")
	public ResponseEntity<String> updateFlightById (@PathVariable("flightId") int flightId,@RequestBody Flight flight) {
		flightService.updateFlightById(flight);
		return ResponseEntity.status(HttpStatus.OK).body("Flight is updated");
		}

	
	//Delete Flight API
	
	
	@DeleteMapping("/delete/{flightId}")
	public ResponseEntity<String> deleteFlightById(@PathVariable("flightId") int flightId,@RequestBody Flight flight) {

		flightService.deleteFlightById(flight);
		return ResponseEntity.status(HttpStatus.OK).body("Flight is Deleted");
	}
}