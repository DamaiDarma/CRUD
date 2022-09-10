package com.project_crud.crud_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project_crud.crud_project.Model.AbsenSiswa;
import com.project_crud.crud_project.Repository.AbsenSiswaRepository;

@Service
@Transactional
public class AbsenSiswaServiceImplementation implements AbsenSiswaService {
    
    @Autowired
	AbsenSiswaRepository absensiswaRepository;
	
	
	@Override
	public List<AbsenSiswa> getAllAbsenSiswas() {
		return (List<AbsenSiswa>) absensiswaRepository.findAll();
	}

	@Override
	public AbsenSiswa getAbsenSiswaById(int id) {
		return absensiswaRepository.findById(id).get();
	}

	@Override
	public void addAbsenSiswa(AbsenSiswa absensiswa) {
		absensiswaRepository.save(absensiswa);
	}

	@Override
	public void deleteAbsenSiswa(int id) {
		absensiswaRepository.deleteById(id);
	}
}
