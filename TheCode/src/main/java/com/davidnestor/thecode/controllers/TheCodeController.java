package com.davidnestor.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
    @PostMapping("/check")
    public String errors(RedirectAttributes redirectAttributes, @RequestParam("password") String password){
    	if(password.equals("bushido")) {
    		return "code.jsp";
    	}
    	else {
        redirectAttributes.addFlashAttribute("errors", "You must train harder!");
        return "redirect:/";
    	}
    }
}
