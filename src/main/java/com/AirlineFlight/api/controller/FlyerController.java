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

import com.AirlineFlight.api.Service.FlyerService;

import com.AirlineFlight.api.model.Flyer;


@RestController

public class FlyerController {
	
	@Autowired
	private FlyerService flyerService;
	
	//Flyer POST Api
	@PostMapping("/api/flyer/add")
	public ResponseEntity<String> postFlyer(@RequestBody Flyer flyer){
		flyerService.insertFlyer(flyer);
		return ResponseEntity.status(HttpStatus.OK).body("Flyer added to Portal!!!");
		
	}
	//Get By Id
<<<<<<< HEAD
	@GetMapping("/api/flyer/one/{id}")
=======
	@GetMapping("/one/{flyerId}")
>>>>>>> 4a04f3b7070adec1ca04f951adf9e13ab9bdd3dc
	public ResponseEntity<Object> getFlyerById(@PathVariable("flyerId")int flyerId){
		Optional<Flyer> optional=flyerService.getflyerById(flyerId);
		if(optional == null)
			return ResponseEntity.status(HttpStatus.OK).body("Invalid ID given");
		
		Flyer flyer = optional.get();
		return ResponseEntity.status(HttpStatus.OK).body(flyer);
	}
	//Get All Api
	@GetMapping("/api/flyer/getall")
	public List<Flyer> getAllFlyer(){
		List<Flyer> list = flyerService.getAllflyers();
		return list;
	}
	//PUT Api
	@PutMapping("/api/flyer/one/{flyerId}")
	public ResponseEntity<String> updateFlyerById(@PathVariable("flyerId") int flyerId,@RequestBody Flyer flyer){
		flyerService.updateFlyerById(flyer);
		return ResponseEntity.status(HttpStatus.OK).body("Flyer is Updated");
	}
	
	
	//DELETE Api
	@DeleteMapping("/api/flyer/{flyerId}")
	public ResponseEntity<String> deleteFlyerById(@PathVariable("flyerId") int flyerId,@RequestBody Flyer flyer){
		flyerService.deleteFlyerById(flyer);
		return ResponseEntity.status(HttpStatus.OK).body("Flyer is Deleted");
		}
	
	
	
	

}
