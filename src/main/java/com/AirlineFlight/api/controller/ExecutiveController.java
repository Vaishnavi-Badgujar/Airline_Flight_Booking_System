package com.AirlineFlight.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AirlineFlight.api.Service.ExecutiveService;
import com.AirlineFlight.api.model.Executive;
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class ExecutiveController {

	@Autowired
	private ExecutiveService executiveService;

	// Executive post API
	@PostMapping("/api/executive/add")
	public ResponseEntity<String> postExecutive(@RequestBody Executive executive) {
		executiveService.insertExecutive(executive);
		return ResponseEntity.status(HttpStatus.OK).body("Executive added in DB");

	}

	// GetAllAPI
	@GetMapping("/api/executive/getAll")
	public List<Executive> getAllExecutives() {
		List<Executive> list = executiveService.getAllExecutives();
		return list;

	}

	// GetById API
	@GetMapping("/api/executive/one/{id}")
	public ResponseEntity<Object> getExecutiveById(@PathVariable("id") int id) {
		Optional<Executive> optional = executiveService.getExecutiveById(id);
		if (optional == null)
			return ResponseEntity.status(HttpStatus.OK).body("Invalid ID Given");

		Executive executive = optional.get();
		return ResponseEntity.status(HttpStatus.OK).body(executive);

	}

	// PUT API
	@PutMapping("/api/executive/two/{id}")
	public ResponseEntity<String> updateExecutiveById(@PathVariable("id") int id, @RequestBody Executive executive) {
		executiveService.updateExecutiveById(executive);
		return ResponseEntity.status(HttpStatus.OK).body("Executive is updated");

	}
	//DELETE API
	@DeleteMapping("/api/executive/{id}")
	public ResponseEntity<String> deleteExecutiveById(@PathVariable("id") int id, @RequestBody Executive executive) {
		executiveService.deleteExecutiveById(executive);
		return ResponseEntity.status(HttpStatus.OK).body("Executive is Deleted");
	}
	

}
