package com.AirlineFlight.api.data;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.AirlineFlight.api.model.Flight;

public interface FlightRepository extends JpaRepositoryImplementation<Flight, Integer>{

}
