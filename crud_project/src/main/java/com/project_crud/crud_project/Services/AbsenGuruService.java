package com.project_crud.crud_project.Services;

import java.util.List;
import com.project_crud.crud_project.Model.AbsenGuru;


public interface AbsenGuruService {

    public List<AbsenGuru> getAllAbsenGurus();
	 
	 public AbsenGuru getAbsenGuruById(int id);
	 
	 public void addAbsenGuru(AbsenGuru absenguru);
	 
	 public void deleteAbsenGuru(int id);
    
}
