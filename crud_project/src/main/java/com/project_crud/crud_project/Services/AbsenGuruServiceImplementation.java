package com.project_crud.crud_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project_crud.crud_project.Model.AbsenGuru;
import com.project_crud.crud_project.Repository.AbsenGuruRepository;

@Service
@Transactional
public class AbsenGuruServiceImplementation implements AbsenGuruService {

    @Autowired
	AbsenGuruRepository absenguruRepository;
	
	
	@Override
	public List<AbsenGuru> getAllAbsenGurus() {
		return (List<AbsenGuru>) absenguruRepository.findAll();
	}

	@Override
	public AbsenGuru getAbsenGuruById(int id) {
		return absenguruRepository.findById(id).get();
	}

	@Override
	public void addAbsenGuru(AbsenGuru absenguru) {
		absenguruRepository.save(absenguru);
	}

	@Override
	public void deleteAbsenGuru(int id) {
		absenguruRepository.deleteById(id);
	}
    
}
