package com.project_crud.crud_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.Guru;
import com.project_crud.crud_project.Services.GuruService;

@Controller
@RequestMapping(value="/guru")
public class GuruController {
    
    @Autowired
	GuruService guruService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("guru_list");
	  List<Guru> guruList = guruService.getAllGurus();
	  model.addObject("guruList", guruList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addguru/", method=RequestMethod.GET)
	 public ModelAndView addguru() {
		 
	  ModelAndView model = new ModelAndView();
	  Guru guru = new Guru();
	  model.addObject("guruForm", guru);
	  model.setViewName("guru_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editguru/{id}", method=RequestMethod.GET)
	 public ModelAndView editguru(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Guru guru = guruService.getGuruById(id);
	  model.addObject("guruForm", guru);
	  model.setViewName("guru_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addguru", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("guruForm") Guru guru) {
		 
	  guruService.addGuru(guru);
	  return new ModelAndView("redirect:/guru/list");
	  
	 }
	 
	 @RequestMapping(value="/deleteguru/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  guruService.deleteGuru(id);
	  return new ModelAndView("redirect:/guru/list");
	  
	 }

}
