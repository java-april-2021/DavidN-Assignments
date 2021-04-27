package com.davidnestor.routingpractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*//    Create a controller named 'CodingController'. For the first 3 routes, use the @RequestMapping annotation.
Have an http GET request to 'http://localhost:8080/coding' display a text that says 'Hello Coding Dojo!'.
Have an http GET request to 'http://localhost:8080/coding/python' display a text that says 'Python/Django was awesome!'.
Have an http GET request to 'http://localhost:8080/coding/java' display a text that says 'Java/Spring is better!'.
Create another controller named 'Dojo Controller'. For the routes below, use the @PathVariable annotation.
Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
Have an http GET request to 'http://localhost:8080/dojo/burbank' display a text that says 'Burbank Dojo is located in Southern California'.
Have an http GET request to 'http://localhost:8080/dojo/san-jose' display a text that says 'SJ dojo is the headquarters'.*/

@RestController
@RequestMapping("/dojo")
public class DojoController {
	
	@RequestMapping("")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/{location}")
	public String location(@PathVariable("location") String location) {
		if(location.equals("burbank")) {
			return "Burbank Dojo is located in Socal";
		}
		else {
			return "SJ dojo is the headquarters";
		}
	}
}
