package com.project_crud.crud_project.Services;

import java.util.List;
import com.project_crud.crud_project.Model.AbsenSiswa;

public interface AbsenSiswaService {


    public List<AbsenSiswa> getAllAbsenSiswas();
	 
	 public AbsenSiswa getAbsenSiswaById(int id);
	 
	 public void addAbsenSiswa(AbsenSiswa absensiswa);
	 
	 public void deleteAbsenSiswa(int id);
    
}
