package com.AirlineFlight.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AirlineFlight.api.Service.FlightService;
import com.AirlineFlight.api.Service.FlyerFlightService;
import com.AirlineFlight.api.Service.FlyerService;
import com.AirlineFlight.api.model.Flight;
import com.AirlineFlight.api.model.Flyer;
import com.AirlineFlight.api.model.FlyerFlight;

@RestController
@RequestMapping("/api/flyer/flight")
public class FlyerFlightController {

	@Autowired
	private FlyerService flyerService;

	@Autowired
	private FlightService flightService;

	@Autowired
	private FlyerFlightService flyerFlightService;

	@PostMapping("/add/{flyerId}/{flightId}")
	public ResponseEntity<String> assignFlyerToFlight(@RequestBody FlyerFlight flyerFlight,
			@PathVariable("flightId") int flightId, @PathVariable("flyerId") int flyerId) {
		Optional<Flight> optionalFlight = flightService.getFlyerByID(flyerId);

		if (!optionalFlight.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Flight ID Given");

		Optional<Flyer> optionalFlyer = flyerService.getFlyerByID(flyerId);

		if (!optionalFlyer.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Flyer ID Given");

		Flight flight = optionalFlight.get();
		Flyer flyer = optionalFlyer.get();

		flyerFlight.setFlight(flight);
		flyerFlight.setFlyer(flyer);

		flyerFlightService.insert(flyerFlight);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Flyer assigned to Flight");

	}
	
	
}
