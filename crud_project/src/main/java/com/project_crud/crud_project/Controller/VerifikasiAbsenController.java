package com.project_crud.crud_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.VerifikasiAbsen;
import com.project_crud.crud_project.Services.VerifikasiAbsenService;

public class VerifikasiAbsenController {

    @Autowired
	VerifikasiAbsenService VerifikasiAbsenService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("VerifikasiAbsen_list");
	  List<VerifikasiAbsen> verifikasiabsenList = VerifikasiAbsenService.getAllVerifikasiAbsens();
	  model.addObject("VerifikasiAbsenList", verifikasiabsenList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addVerifikasiAbsen/", method=RequestMethod.GET)
	 public ModelAndView addVerifikasiAbsen() {
		 
	  ModelAndView model = new ModelAndView();
	  VerifikasiAbsen VerifikasiAbsen = new VerifikasiAbsen();
	  model.addObject("VerifikasiAbsenForm", VerifikasiAbsen);
	  model.setViewName("VerifikasiAbsen_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editVerifikasiAbsen/{id}", method=RequestMethod.GET)
	 public ModelAndView editVerifikasiAbsen(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  VerifikasiAbsen VerifikasiAbsen = VerifikasiAbsenService.getVerifikasiAbsenById(id);
	  model.addObject("VerifikasiAbsenForm", VerifikasiAbsen);
	  model.setViewName("verifikasiabsen_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addVerifikasiAbsen", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("verifikasiabsenForm") VerifikasiAbsen VerifikasiAbsen) {
		 
	  VerifikasiAbsenService.addVerifikasiAbsen(VerifikasiAbsen);
	  return new ModelAndView("redirect:/verifikasiabsen/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteVerifikasiAbsen/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  VerifikasiAbsenService.deleteVerifikasiAbsen(id);
	  return new ModelAndView("redirect:/verifikasiabsen/list");
	  
	 }


}
