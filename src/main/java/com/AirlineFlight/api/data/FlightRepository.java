package com.AirlineFlight.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlineFlight.api.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
