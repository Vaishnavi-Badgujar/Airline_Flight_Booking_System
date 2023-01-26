package com.AirlineFlight.api.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AirlineFlight.api.model.Flyer;
import com.AirlineFlight.api.model.FlyerFlight;

public interface FlyerFlightRepository extends JpaRepository<FlyerFlight, Integer>
{
@Query("select ff.flyer from FlyerFlight ff where ff.flight.id=?1")
List<Flyer> getByFlightId(int id);
}