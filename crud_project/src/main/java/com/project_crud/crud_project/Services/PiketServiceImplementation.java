package com.project_crud.crud_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project_crud.crud_project.Model.Piket;
import com.project_crud.crud_project.Repository.PiketRepository;

@Service
@Transactional
public class PiketServiceImplementation implements PiketService {
    
    @Autowired
	PiketRepository piketRepository;
	
	
	@Override
	public List<Piket> getAllPikets() {
		return (List<Piket>) piketRepository.findAll();
	}

	@Override
	public Piket getPiketById(int id) {
		return piketRepository.findById(id).get();
	}

	@Override
	public void addPiket(Piket piket) {
		piketRepository.save(piket);
	}

	@Override
	public void deletePiket(int id) {
		piketRepository.deleteById(id);
	}

}
