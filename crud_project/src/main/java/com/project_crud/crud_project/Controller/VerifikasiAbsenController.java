package com.project_crud.crud_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.VerifikasiAbsen;
import com.project_crud.crud_project.Services.VerifikasiAbsenService;

@Controller
@RequestMapping(value="/verifikasiabsen")
public class VerifikasiAbsenController {

    @Autowired
	VerifikasiAbsenService verifikasiabsenService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("VerifikasiAbsen_list");
	  List<VerifikasiAbsen> verifikasiabsenList = verifikasiabsenService.getAllVerifikasiAbsens();
	  model.addObject("verifikasiabsenList", verifikasiabsenList);
	
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
	  
	  VerifikasiAbsen VerifikasiAbsen = verifikasiabsenService.getVerifikasiAbsenById(id);
	  model.addObject("VerifikasiAbsenForm", VerifikasiAbsen);
	  model.setViewName("verifikasiabsen_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addVerifikasiAbsen", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("verifikasiabsenForm") VerifikasiAbsen VerifikasiAbsen) {
		 
	  verifikasiabsenService.addVerifikasiAbsen(VerifikasiAbsen);
	  return new ModelAndView("redirect:/verifikasiabsen/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteVerifikasiAbsen/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  verifikasiabsenService.deleteVerifikasiAbsen(id);
	  return new ModelAndView("redirect:/verifikasiabsen/list");
	  
	 }


}
