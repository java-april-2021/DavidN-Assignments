package com.davidnestor.displaydate.controllers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	
	@RequestMapping("/date")
	public String date(Model viewModel) {
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("eeee',' 'the' dd 'of' MMMM, u"); 
		viewModel.addAttribute("date", formatter.format(now));
		return "index.jsp";
	}
	@RequestMapping("/time")
	public String time(Model viewModel) {
		LocalTime now = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a"); 
		viewModel.addAttribute("date", formatter.format(now));
		return "index.jsp";
	}
	
}
