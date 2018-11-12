package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{

	@Override
	public Patient getPatientDetails() {
		// TODO Auto-generated method stub
		Patient p = new Patient();
		p.setPatientId(101);
		p.setName("Nishi");
		p.setAge(50);
		return p;
	}

	@Override
	public Patient getPatientDetailsById(int id) {
		// TODO Auto-generated method stub
		Patient p = new Patient();
		p.setPatientId(id);
		p.setName("Nishi");
		p.setAge(50);
		return p;	}
	
	

}
