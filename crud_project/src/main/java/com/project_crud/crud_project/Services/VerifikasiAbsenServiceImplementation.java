package com.project_crud.crud_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project_crud.crud_project.Model.VerifikasiAbsen;
import com.project_crud.crud_project.Repository.VerifikasiAbsenRepository;

@Service
@Transactional
public class VerifikasiAbsenServiceImplementation implements VerifikasiAbsenService {

    @Autowired
	VerifikasiAbsenRepository verifikasiabsenRepository;
	
	
	@Override
	public List<VerifikasiAbsen> getAllVerifikasiAbsens() {
		return (List<VerifikasiAbsen>) verifikasiabsenRepository.findAll();
	}

	@Override
	public VerifikasiAbsen getVerifikasiAbsenById(int id) {
		return verifikasiabsenRepository.findById(id).get();
	}

	@Override
	public void addVerifikasiAbsen(VerifikasiAbsen verifikasiabsen) {
		verifikasiabsenRepository.save(verifikasiabsen);
	}

	@Override
	public void deleteVerifikasiAbsen(int id) {
		verifikasiabsenRepository.deleteById(id);
	}
    
}
