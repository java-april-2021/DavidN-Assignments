package com.davidnestor.dojosurvey.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@PostMapping("/result")
	public String result(Model model, @RequestParam("name") String name, @RequestParam("location") String location, @RequestParam("language") String language, @RequestParam("comment") String comment) {
		 model.addAttribute("name", name);
		 model.addAttribute("location", location);
		 model.addAttribute("language", language);
		 model.addAttribute("comment", comment);
		 return "result.jsp";
	}
}
