package com.Planner.PlannerApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Planner.PlannerApi.beans.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	public User findByEmail(String email);
}
