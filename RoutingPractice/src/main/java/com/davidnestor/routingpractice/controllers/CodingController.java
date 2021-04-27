package com.davidnestor.routingpractice.controllers;
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
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String python() {
		return "Python/Django was Awesome!";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
	
}
