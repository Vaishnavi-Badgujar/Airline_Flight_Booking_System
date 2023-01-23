package com.AirlineFlight.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlineFlight.api.Service.ExecutiveService;
import com.AirlineFlight.api.model.Executive;
import com.bootapp.rest.restapp.model.Instructor;



@RestController
@RequestMapping("/api/executive")
public class ExceutiveController {
	
	
	@Autowired
	private ExecutiveService executiveService;
	
	/* Executive  POST api */
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
	

}
