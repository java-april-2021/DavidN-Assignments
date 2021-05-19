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

import com.davidnestor.relationships.models.License;
import com.davidnestor.relationships.models.Person;
import com.davidnestor.relationships.services.LicenseService;
import com.davidnestor.relationships.services.PersonService;

@Controller
public class LicenseController {
	@Autowired
	private PersonService pService;
	
	@Autowired 
	private LicenseService lService;
	
	
	@GetMapping("/persons/new")
	public String index(@ModelAttribute("Person") Person person) {
		return "newperson.jsp";
	}
	
	@PostMapping("persons/create")
    public String create(@Valid @ModelAttribute("Person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "newperson.jsp";
        } else {
            pService.createPerson(person);
            return "redirect:/persons/new";
        }
    }
	
	@GetMapping("/licenses/new")
	public String index(@ModelAttribute("License") License license, Model viewmodel) {
		viewmodel.addAttribute("Persons", pService.findAllPersons());
		return "newlicense.jsp";
	}
	@PostMapping("licenses/create")
	public String create(@Valid @ModelAttribute("License") License license, BindingResult result) {
        if (result.hasErrors()) {
            return "newlicense.jsp";
        } else {
            lService.createLicense(license);
            return "redirect:/licenses/new";
        }
	}
	
	@GetMapping("/persons/{id}")
	public String display(@PathVariable("id") Long id, Model viewmodel) {
		viewmodel.addAttribute("Person", this.pService.getPerson(id));
		viewmodel.addAttribute("License", this.pService.getPerson(id).getLicense());
		return "display.jsp";
	}
}
