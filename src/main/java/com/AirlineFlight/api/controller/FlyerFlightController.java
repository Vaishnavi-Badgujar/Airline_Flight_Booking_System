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
@RequestMapping("/api/flight/flyer")
public class FlyerFlightController {

	@Autowired
	private FlyerService flyerService;

	@Autowired
	private FlightService flightService;

	@Autowired
	private FlyerFlightService flyerflightService;

	@PostMapping("/add/{flightId}/{flyerId}")
	public ResponseEntity<String> assignFlyerToFlight(@RequestBody FlyerFlight flyerFlight,
													@PathVariable("flightId") int flightId, 
													@PathVariable("flyerId") int flyerId) {
		Optional<Flight> optionalFlight = flightService.getFlightById(flightId);

		if (!optionalFlight.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Flight ID Given");

		Optional<Flyer> optionalFlyer = flyerService.getFlyerByID(flyerId);

		if (!optionalFlyer.isPresent())
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Flyer ID Given");

		Flight flight = optionalFlight.get();
		Flyer flyer = optionalFlyer.get();

		flyerFlight.setFlight(flight);
		flyerFlight.setFlyer(flyer);

		flyerflightService.assign(flyerFlight);
		return ResponseEntity.status(HttpStatus.OK).body("Flight assigned to Flyer");

	}
@GetMapping("/allFlyerFlight")
public List<FlyerFlight> getAllFlyerFlight(){
	List<FlyerFlight> list=flyerflightService.getAllFlyerFlight();
	return list;
}
//get flyer flight by id
@GetMapping("/one/{flyerflightId}")
public ResponseEntity<Object> getFlyerFlightById(@PathVariable("flyerflightId") int flyerflightId){
	Optional<FlyerFlight> optional= flyerflightService.getFlyerFlightById(flyerflightId);
	if(!optional.isPresent())
	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Id Given");
	FlyerFlight flyerflight = optional.get();
	return ResponseEntity.status(HttpStatus.OK).body(flyerflight);
	}

//get flyer by flightId
@GetMapping("/flyers/{flyerflightId}")
public List<Flyer> getFlyerByFlightId(@PathVariable("flyerflightId") int flyerflightId)
{
	List<Flyer> list = flyerflightService.getFlyerByFlightId(flyerflightId);
			return list;
}
@DeleteMapping("/delete/{flyerflightId}")
public ResponseEntity<String> deleteFlyer(@PathVariable("flyerflightId") int flyerflightId)
{
	flyerflightService.deleteFlyerFlightById(flyerflightId);
	return ResponseEntity.status(HttpStatus.OK).body("FlyerFlight deleted"  );
	
}
	//get flight by flyerId
@GetMapping("/flyer/{flyerId}")
public List<Flight> getFlightByFlyerId(@PathVariable("flyerId")int flyerId){
	List<Flight>list= flyerflightService.getFlightByFlyerId(flyerId);
	return list;
}
}
