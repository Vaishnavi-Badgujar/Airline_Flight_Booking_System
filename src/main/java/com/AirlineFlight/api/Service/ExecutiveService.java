package com.AirlineFlight.api.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AirlineFlight.api.data.ExecutiveRepository;
import com.AirlineFlight.api.model.Executive;

@Service
public class ExecutiveService {
	@Autowired
	private ExecutiveRepository executiveRepository;

	public void insertExecutive(Executive executive) {
		executiveRepository.save(executive);
	}

	public List<Executive> getAllExecutives() {
		 
		 return executiveRepository.findAll();
		 
	}


	public Optional<Executive> getExecutiveById(int id) {
		Optional<Executive> optional = executiveRepository.findById(id);
		return optional;
	}

	public void updateExecutiveById(Executive executive) {
		executiveRepository.save(executive);
	}

	public void deleteExecutiveById(Executive executive) {
		executiveRepository.delete(executive);

	}
}