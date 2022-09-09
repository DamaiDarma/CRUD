package com.project_crud.crud_project.Services;

import java.util.List;
import com.project_crud.crud_project.Model.Guru;

public interface GuruService {
    
    public List<Guru> getAllGurus();
	 
	 public Guru getGuruById(int id);
	 
	 public void addGuru(Guru guru);
	 
	 public void deleteGuru(int id);

}
