package com.AirlineFlight.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<String> assignFlightToFlyer(@RequestBody FlyerFlight flyerFlight,
			@PathVariable("flyerId") int flyerId, @PathVariable("flightId") int flightId) {
		Optional<Flyer> optionalFlyer = flyerService.getflyerById(flyerId);
		if (!optionalFlyer.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("entered invalid flyerId");

		Optional<Flight> optionalFlight = flightService.getFlightById(flightId);
		if (!optionalFlight.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("entered invalid flightId");

		Flyer flyer = optionalFlyer.get();
		Flight flight = optionalFlight.get();

		flyerFlight.setFlyer(flyer);
		flyerFlight.setFlight(flight);

		flyerFlightService.assign(flyerFlight);
		return ResponseEntity.status(HttpStatus.OK).body("flight is assigned to flyer");

	}
//	@GetMapping("/allFlyerFlight")
//	public List<FlyerFlight> getAllFlyerFlight(){
//		List<FlyerFlight> list = flyerFlightService.getAllFlyerFlight();
//		return list;
//	}
}
