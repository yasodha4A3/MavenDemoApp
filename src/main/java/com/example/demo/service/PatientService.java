package com.example.demo.service;

import com.example.demo.model.Patient;

public interface PatientService {
	
	public Patient getPatientDetails();
	public Patient getPatientDetailsById(int id);

}
