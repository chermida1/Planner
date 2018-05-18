package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.Planner;

public interface PlannerRepo extends JpaRepository<Planner, Integer>{
}
