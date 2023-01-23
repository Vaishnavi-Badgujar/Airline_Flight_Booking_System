package com.AirlineFlight.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlineFlight.api.model.FlyerFlight;

public interface FlyerFlightRepository extends JpaRepository<FlyerFlight, Integer>
{
	
}