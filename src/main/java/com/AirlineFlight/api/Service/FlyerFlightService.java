package com.AirlineFlight.api.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.FlyerFlightRepository;
import com.AirlineFlight.api.model.FlyerFlight;

@Service
public class FlyerFlightService {
	
	@Autowired
	private FlyerFlightRepository flyerFlightRepository;
	

	public void insert(FlyerFlight flyerFlight) {
		// TODO Auto-generated method stub
		flyerFlightRepository.save(flyerFlight);
	}

}
