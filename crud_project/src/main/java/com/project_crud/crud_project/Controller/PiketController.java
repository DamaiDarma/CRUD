package com.project_crud.crud_project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project_crud.crud_project.Model.Piket;
import com.project_crud.crud_project.Services.PiketService;

@Controller
@RequestMapping(value="/piket")
public class PiketController {
    
    @Autowired
	PiketService PiketService;
	
	
	 @RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
		 
	  ModelAndView model = new ModelAndView("Piket_list");
	  List<Piket> PiketList = PiketService.getAllPikets();
	  model.addObject("PiketList", PiketList);
	
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/addPiket/", method=RequestMethod.GET)
	 public ModelAndView addPiket() {
		 
	  ModelAndView model = new ModelAndView();
	  Piket Piket = new Piket();
	  model.addObject("PiketForm", Piket);
	  model.setViewName("Piket_form");
	  
	  return model;
	 }
	 
	 
	 
	 @RequestMapping(value="/editPiket/{id}", method=RequestMethod.GET)
	 public ModelAndView editPiket(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  
	  Piket Piket = PiketService.getPiketById(id);
	  model.addObject("PiketForm", Piket);
	  model.setViewName("Piket_form");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/addPiket", method=RequestMethod.POST)
	 public ModelAndView add(@ModelAttribute("PiketForm") Piket Piket) {
		 
	  PiketService.addPiket(Piket);
	  return new ModelAndView("redirect:/Piket/list");
	  
	 }
	 
	 @RequestMapping(value="/deletePiket/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 
	  PiketService.deletePiket(id);
	  return new ModelAndView("redirect:/Piket/list");
	  
	 } 


}
