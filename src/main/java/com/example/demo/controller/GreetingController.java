package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MessageService;

@RestController
public class GreetingController {
	@Autowired
	MessageService service;

	@RequestMapping(method=RequestMethod.GET,value="/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return service.getGreeting(name);
	}

	@GetMapping("/wish")
	public String wish() {
		return "Hai Yasodha";
	}
	private void display() {
		System.out.println("Entered into controller");
		System.out.println("something");
		System.out.println("Entered into controller");
		System.out.println("something");
		System.out.println("Entered into controller");
		System.out.println("end");
	}
}
