package com.AirlineFlight.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AirlineFlight.api.model.Airline;

public interface AirlineRepository extends JpaRepository<Airline,Integer>{

}
