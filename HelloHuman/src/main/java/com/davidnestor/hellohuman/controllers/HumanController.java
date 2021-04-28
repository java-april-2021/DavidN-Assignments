package com.davidnestor.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required = false) String name, Model model) {
		if(name == null) {
			model.addAttribute("name", "human");
			return "index.jsp";
		}
		else {
			model.addAttribute("name", name);
			return "index.jsp";
		}
	}
	
}
