package com.project_crud.crud_project.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.AbsenGuru;
import com.project_crud.crud_project.Services.AbsenGuruService;

@Controller
@RequestMapping(value="/absenguru")
public class AbsenGuruController {

    @Autowired
	AbsenGuruService absenguruService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("guru_list");
	  List<AbsenGuru> absenguruList = absenguruService.getAllAbsenGurus();
	  model.addObject("absenguruList", absenguruList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addabsenguru/", method=RequestMethod.GET)
	 public ModelAndView addabsenguru() {
		 
	  ModelAndView model = new ModelAndView();
	  AbsenGuru absenguru = new AbsenGuru();
	  model.addObject("absenguruForm", absenguru);
	  model.setViewName("absenguru_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editabsenguru/{id}", method=RequestMethod.GET)
	 public ModelAndView editAbsenGuru(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  AbsenGuru absenguru = absenguruService.getAbsenGuruById(id);
	  model.addObject("ansenguruForm", absenguru);
	  model.setViewName("absenguru_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addabsenguru", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("absenguruForm") AbsenGuru absenguru) {
		 
	  absenguruService.addAbsenGuru(absenguru);
	  return new ModelAndView("redirect:/absenguru/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteabsenguru/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  absenguruService.deleteAbsenGuru(id);
	  return new ModelAndView("redirect:/absenguru/list");
	  
	 }
}
