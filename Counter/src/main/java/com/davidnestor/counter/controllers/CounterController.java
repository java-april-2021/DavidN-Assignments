package com.davidnestor.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String welcome(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer)session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		model.addAttribute("count", (Integer)session.getAttribute("count"));
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String showCount(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer)session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		model.addAttribute("count", (Integer)session.getAttribute("count"));
		return "countdisplay.jsp";
	}
}
