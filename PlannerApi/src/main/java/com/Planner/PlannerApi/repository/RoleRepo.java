package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
