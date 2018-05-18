package com.Planner.PlannerApi.service;

import java.util.List;

import com.Planner.PlannerApi.beans.Patient;

public interface PatientService {
	public void createPatient(Patient newPatient);
	
	public List<Patient> getAllPatients();
}
