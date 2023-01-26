package com.AirlineFlight.api.data;

import org.springframework.data.jpa.repository.JpaRepository;



import com.AirlineFlight.api.model.Flyer;

public interface FlyerRepository extends JpaRepository<Flyer, Integer>{
	

}
