package com.Planner.PlannerApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Planner.PlannerApi.beans.Patient;
import com.Planner.PlannerApi.service.PatientService;

@RestController
public class PatientCtrl {
	@Autowired
	PatientService patientService;

	@GetMapping("/getAllPatients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@PostMapping("/createPatient")
	public void createPatient(@RequestBody Patient newPatient) {
		patientService.createPatient(newPatient);
	}
	
}
