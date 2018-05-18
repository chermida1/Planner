package com.Planner.PlannerApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Planner.PlannerApi.beans.Patient;
import com.Planner.PlannerApi.repository.PatientRepo;

@Service
public class PatientServiceImp implements PatientService {
	@Autowired
	PatientRepo repo;

	@Override
	public void createPatient(Patient newPatient) {
		repo.save(newPatient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return repo.findAll();
	}

}
