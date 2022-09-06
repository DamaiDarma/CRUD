package services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Guru;
import repository.gururepository;

@Service
@Transactional
public class guruserviceimplementation implements guruservice {
    
    @Autowired
	gururepository guruRepository;
	
	
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
