package com.AirlineFlight.api.data;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AirlineFlight.api.model.Flyer;

public interface FlyerRepository extends JpaRepository<Flyer, Integer>{
	@Query("select f from Flyer f join f.flights f where f.id=?1")
List<Flyer> getFlyerByFlightId(int id);
}
