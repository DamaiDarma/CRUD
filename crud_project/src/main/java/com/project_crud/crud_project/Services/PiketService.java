package com.project_crud.crud_project.Services;

import java.util.List;
import com.project_crud.crud_project.Model.Piket;
public interface PiketService {

    public List<Piket> getAllPikets();
	 
    public Piket getPiketById(int id);
    
    public void addPiket(Piket piket);
    
    public void deletePiket(int id);
    
}
