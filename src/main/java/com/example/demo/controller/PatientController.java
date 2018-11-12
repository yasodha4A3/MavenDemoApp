package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	PatientService service;

	@RequestMapping(method=RequestMethod.GET,value="/getPatientDetails")
	public Patient getPatientDetails() {
		return service.getPatientDetails();
	}
	@RequestMapping(method=RequestMethod.GET,value="/getPatientDetails/{id}")
	public Patient getPatientDetailsById(@PathVariable int id) {
		return service.getPatientDetailsById(id);
	}
}
