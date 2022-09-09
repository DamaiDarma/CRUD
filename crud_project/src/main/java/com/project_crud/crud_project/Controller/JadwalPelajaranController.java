package com.project_crud.crud_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.JadwalPelajaran;
import com.project_crud.crud_project.Services.JadwalPelajaranService;

@Controller
@RequestMapping(value="/jadwalpelajaran")
public class JadwalPelajaranController {
    
    @Autowired
	JadwalPelajaranService jadwalpelajaranService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("jadwalpelajaran_list");
	  List<JadwalPelajaran> jadwalpelajaranList = jadwalpelajaranService.getAllJadwalPelajarans();
	  model.addObject("jadwalpelajaranList", jadwalpelajaranList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addjadwalpelajaran/", method=RequestMethod.GET)
	 public ModelAndView addjadwalpelajaran() {
		 
	  ModelAndView model = new ModelAndView();
	  JadwalPelajaran jadwalpelajaran = new JadwalPelajaran();
	  model.addObject("jadwalpelajaranForm", jadwalpelajaran);
	  model.setViewName("jadwalpelajaran_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editjadwalpelajaran/{id}", method=RequestMethod.GET)
	 public ModelAndView editjadwalpelajaran(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  JadwalPelajaran jadwalpelajaran = jadwalpelajaranService.getJadwalPelajaranById(id);
	  model.addObject("jadwalpelajaranForm", jadwalpelajaran);
	  model.setViewName("jadwalpelajaran_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addjadwalpelajaran", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("jadwalpelajaranForm") JadwalPelajaran jadwalpelajaran) {
		 
	  jadwalpelajaranService.addJadwalPelajaran(jadwalpelajaran);
	  return new ModelAndView("redirect:/jadwalpelajaran/list");
	  
	 }
	 
	 @RequestMapping(value="/deletejadwalpelajaran/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  jadwalpelajaranService.deleteJadwalPelajaran(id);
	  return new ModelAndView("redirect:/jadwalpelajaran/list");
	  
	 }
}
