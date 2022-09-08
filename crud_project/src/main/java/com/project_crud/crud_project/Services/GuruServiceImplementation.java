package com.project_crud.crud_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project_crud.crud_project.Model.Guru;
import com.project_crud.crud_project.Repository.GuruRepository;

@Service
@Transactional

public class GuruServiceImplementation implements GuruService {

    @Autowired
	GuruRepository guruRepository;
	
	
	@Override
	public List<Guru> getAllGurus() {
		return (List<Guru>) guruRepository.findAll();
	}

	@Override
	public Guru getGuruById(int id) {
		return guruRepository.findById(id).get();
	}

	@Override
	public void addGuru(Guru guru) {
		guruRepository.save(guru);
	}

	@Override
	public void deleteGuru(int id) {
		guruRepository.deleteById(id);
	}
    
}
