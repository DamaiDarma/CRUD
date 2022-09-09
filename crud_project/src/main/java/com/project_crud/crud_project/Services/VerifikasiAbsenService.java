package com.project_crud.crud_project.Services;

import java.util.List;
import com.project_crud.crud_project.Model.VerifikasiAbsen;


public interface VerifikasiAbsenService {
    
    public List<VerifikasiAbsen> getAllVerifikasiAbsens();
	 
    public VerifikasiAbsen getVerifikasiAbsenById(int id);
    
    public void addVerifikasiAbsen(VerifikasiAbsen verifikasiabsen);
    
    public void deleteVerifikasiAbsen(int id);

}
