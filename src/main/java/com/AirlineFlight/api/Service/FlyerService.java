package com.AirlineFlight.api.Service;


import java.util.Optional;

import com.AirlineFlight.api.model.Flyer;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AirlineFlight.api.data.FlyerRepository;
import com.AirlineFlight.api.model.Flyer;
@Service

public class FlyerService {
	
	@Autowired
	private FlyerRepository flyerRepository;

	public void insertFlyer(Flyer flyer) {
		 flyerRepository.save(flyer);
		
	}

	public Optional<Flyer> getflyerById(int id) {
		Optional<Flyer> optional = flyerRepository.findById(id);
		return optional;
	}

	public void updateFlyerById(Flyer flyer) {
		flyerRepository.save(flyer);
		
	}

	public void deleteFlyerById(Flyer flyer) {
		flyerRepository.delete(flyer);
		
	}

	public List<Flyer> getAllflyers() {
		
		return flyerRepository.findAll();
	}



	public Optional<Flyer> getFlyerByID(int flyerId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
