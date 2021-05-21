package com.davidnestor.relationships.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.davidnestor.relationships.models.Dojo;
import com.davidnestor.relationships.models.Ninja;
import com.davidnestor.relationships.services.DojoService;
import com.davidnestor.relationships.services.NinjaService;

@Controller
public class DojoController {
	@Autowired
	private NinjaService nService;
	@Autowired
	private DojoService dService;
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("Dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/create")
    public String create(@Valid @ModelAttribute("Dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "newdojo.jsp";
        } else {
            dService.createDojo(dojo);
            return "redirect:/dojos/new";
        }
    }
	
	@GetMapping("/ninjas/new")
	public String index(@ModelAttribute("Ninja") Ninja ninja, Model viewmodel) {
		viewmodel.addAttribute("Dojos", dService.getAllDojos());
		return "newninja.jsp";
	}
	
	@PostMapping("/ninjas/create")
	public String create(@Valid @ModelAttribute("Ninja") Ninja ninja, BindingResult result) {
        if (result.hasErrors()) {
            return "newninja.jsp";
        } else {
            nService.createNinja(ninja);
            return "redirect:/ninjas/new";
        }
	}
	
	@GetMapping("/dojos/{id}")
	public String location(@PathVariable("id") Long id, Model viewmodel ) {
		viewmodel.addAttribute("Dojo", this.dService.getDojo(id));
		viewmodel.addAttribute("Ninjas", this.nService.findByDojo(id));
		return "location.jsp";
	}
}
