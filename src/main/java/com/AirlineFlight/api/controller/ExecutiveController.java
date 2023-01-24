package com.AirlineFlight.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlineFlight.api.Service.ExecutiveService;
import com.AirlineFlight.api.Service.FlightService;
import com.AirlineFlight.api.model.Executive;
<<<<<<< HEAD:src/main/java/com/AirlineFlight/api/controller/ExceutiveController.java
import com.AirlineFlight.api.model.Flight;

@RestController
@RequestMapping("/api/executive")
public class ExceutiveController {

=======




@RestController
@RequestMapping("/api/executive")
public class ExecutiveController {
	
	
>>>>>>> 13127e211d948a7dd9cdb78ebcd17f9404ea6a1a:src/main/java/com/AirlineFlight/api/controller/ExecutiveController.java
	@Autowired
	private ExecutiveService executiveService;

	@Autowired
	private FlightService flightservice;


	/* Executive POST api */
	@PostMapping("/add")
	public ResponseEntity<String> postExecutive(@RequestBody Executive executive) {
		executiveService.insertFlight(executive);
		return ResponseEntity.status(HttpStatus.OK).body("Executive posted in DB");

	}
	


	/* Get All API */
	@GetMapping("/getAll")
	public List<Executive> getAllExecutives() {
		List<Executive> list = ExecutiveService.getAllExecutives();

		return list;
	}

	/* Get By Id */
	@GetMapping("one/{id}")
	public ResponseEntity<Object> getExecutiveById(@PathVariable("id") int id) {
		Optional<Executive> optional = executiveService.getExecutiveByID(id);
		if (!optional.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ID given");

		Executive executive = optional.get();
		return ResponseEntity.status(HttpStatus.OK).body(executive);
	}



}
