package com.AirlineFlight.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlineFlight.api.Service.FlyerService;
import com.AirlineFlight.api.data.UserRepository;
import com.AirlineFlight.api.model.Flyer;
import com.AirlineFlight.api.model.User;


@RestController
@RequestMapping("/api/flyer")
public class FlyerController {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private FlyerService flyerService;
	
	@PostMapping("/add")
	public ResponseEntity<String> postFlyer(@RequestBody Flyer flyer){
		//fetch user info from flyer input and save it in DB
		User user = flyer.getUser();// i have username and password
		//i will asssign the role
		user.setRole("FLYER");
		//converting plain text password into encoded text
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		//attach encoded password to user
		user.setPassword(encodedPassword);
		user = userRepository.save(user);
		//attach user object to flyer
		flyer.setUser(user);
		flyerService.insertFlyer(flyer);
		return ResponseEntity.status(HttpStatus.OK).body("Flyer added to portal!!!");
		}
	// Get By Id
	@GetMapping("/one/{id}")
	public ResponseEntity<Object> getFlyerById(@PathVariable("flyerId") int flyerId) {
		Optional<Flyer> optional = flyerService.getflyerById(flyerId);
		if (!optional.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ID given");
		Flyer flyer = optional.get();
			return ResponseEntity.status(HttpStatus.OK).body(flyer);
			}
	// Get All Api
	@GetMapping("/getall")
	public List<Flyer> getAllFlyer() {
		List<Flyer> list = flyerService.getAllflyers();
		return list;
		} 
	// PUT Api
	@PutMapping("/one/{flyerId}")
	public ResponseEntity<String> UpdateFlyerById(@PathVariable("flyerId") int flyerId, @RequestBody Flyer flyer) {
		flyerService.updateFlyerById(flyer);
		return ResponseEntity.status(HttpStatus.OK).body("Flyer is Updated");
		} 
	// DELETE Api

	@DeleteMapping("/delete/{flyerId}")
	public ResponseEntity<String> deleteFlyerById(@PathVariable("flyerId") int flyerId, @RequestBody Flyer flyer) {
		flyerService.deleteFlyerById(flyer);
		return ResponseEntity.status(HttpStatus.OK).body("Flyer is Deleted");
		}
}
