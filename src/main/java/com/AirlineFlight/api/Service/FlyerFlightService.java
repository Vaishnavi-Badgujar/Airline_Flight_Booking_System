package com.AirlineFlight.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.FlyerFlightRepository;
import com.AirlineFlight.api.model.FlyerFlight;

@Service
public class FlyerFlightService {
	
	@Autowired
	private FlyerFlightRepository flyerFlightRepository;
	
	public void assign(FlyerFlight flyerFlight) {
		flyerFlightRepository.save(flyerFlight);
		
	}
	
	
}

