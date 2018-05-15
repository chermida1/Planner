package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
