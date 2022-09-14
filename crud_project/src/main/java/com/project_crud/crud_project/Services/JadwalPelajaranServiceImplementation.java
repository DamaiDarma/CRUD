package com.project_crud.crud_project.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project_crud.crud_project.Model.JadwalPelajaran;
import com.project_crud.crud_project.Repository.JadwalPelajaranRepository;

@Service
@Transactional
public class JadwalPelajaranServiceImplementation implements JadwalPelajaranService {
    
    @Autowired
	JadwalPelajaranRepository jadwalpelajaranRepository;
	
	
	@Override
	public List<JadwalPelajaran> getAllJadwalPelajarans() {
		return (List<JadwalPelajaran>) jadwalpelajaranRepository.findAll();
	}

	@Override
	public JadwalPelajaran getJadwalPelajaranById(int id) {
		return jadwalpelajaranRepository.findById(id).get();
	}

	@Override
	public void addJadwalPelajaran(JadwalPelajaran jadwalpelajaran) {
		jadwalpelajaranRepository.save(jadwalpelajaran);
	}

	@Override
	public void deleteJadwalPelajaran(int id) {
		jadwalpelajaranRepository.deleteById(id);
	}

}
