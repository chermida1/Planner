package com.Planner.PlannerApi.service;

import java.util.List;

import com.Planner.PlannerApi.beans.User;

public interface UserService {
	public User getUser(Integer id);

	public List<User> getAllUsers();

	public boolean addUser(User newUser);

	public User loginUser(User loginUser);
}
