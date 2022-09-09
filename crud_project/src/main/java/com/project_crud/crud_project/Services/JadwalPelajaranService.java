package com.project_crud.crud_project.Services;

import java.util.List;
import com.project_crud.crud_project.Model.JadwalPelajaran;


public interface JadwalPelajaranService {

    public List<JadwalPelajaran> getAllJadwalPelajarans();
	 
	 public JadwalPelajaran getJadwalPelajaranById(int id);
	 
	 public void addJadwalPelajaran(JadwalPelajaran jadwalpelajaran);
	 
	 public void deleteJadwalPelajaran(int id);
    
}
