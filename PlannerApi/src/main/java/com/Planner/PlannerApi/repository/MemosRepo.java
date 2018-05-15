package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.Memos;

public interface MemosRepo extends JpaRepository<Memos, Integer> {

}
