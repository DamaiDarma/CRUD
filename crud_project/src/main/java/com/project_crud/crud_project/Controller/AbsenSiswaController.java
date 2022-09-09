package com.project_crud.crud_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.AbsenSiswa;
import com.project_crud.crud_project.Services.AbsenSiswaService;

@Controller
@RequestMapping(value="/absensiswa")
public class AbsenSiswaController {
    
    @Autowired
	AbsenSiswaService absensiswaService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("absensiswa_list");
	  List<AbsenSiswa> AbsenSiswaList = absensiswaService.getAllAbsenSiswas();
	  model.addObject("AbsenSiswaList", AbsenSiswaList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addabsensiswa/", method=RequestMethod.GET)
	 public ModelAndView addabsensiswa() {
		 
	  ModelAndView model = new ModelAndView();
	  AbsenSiswa AbsenSiswa = new AbsenSiswa();
	  model.addObject("AbsenSiswaForm", AbsenSiswa);
	  model.setViewName("AbsenSiswa_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editAbsenSiswa/{id}", method=RequestMethod.GET)
	 public ModelAndView editguru(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  AbsenSiswa AbsenSiswa = absensiswaService.getAbsenSiswaById(id);
	  model.addObject("guruForm", AbsenSiswa);
	  model.setViewName("guru_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addguru", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("guruForm") AbsenSiswa AbsenSiswa) {
		 
	  absensiswaService.addAbsenSiswa(AbsenSiswa);
	  return new ModelAndView("redirect:/guru/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteAbsenSiswa/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  absensiswaService.deleteAbsenSiswa(id);
	  return new ModelAndView("redirect:/AbsenSiswa/list");
	  
	 }


}
