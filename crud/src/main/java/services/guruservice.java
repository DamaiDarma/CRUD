package services;


import java.util.List;
import model.Guru;
public interface guruservice {
    
    public List<Guru> getAllGurus();
	 
	 public Guru getGuruById(int id);
	 
	 public void addGuru(Guru guru);
	 
	 public void deleteGuru(int id);


}
