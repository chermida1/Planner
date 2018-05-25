package com.Planner.PlannerApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Planner.PlannerApi.beans.User;
import com.Planner.PlannerApi.repository.UserRepo;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	UserRepo repo;

	/**
	 * Returns a reference to the entity with the given identifier. Parameters: id
	 * must not be null. 
	 * 
	 * Returns: a reference to the entity with the given
	 * identifier. 
	 * 
	 * Throws: javax.persistence.EntityNotFoundException - if no entity
	 * exists for given id.
	 */
	@Override
	public User getUser(Integer id) {
		return repo.getOne(id);
	}

	/**
	 * Gets all the users in the database
	 * 
	 * Returns: List of Users the the database
	 */
	@Override
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	public boolean addUser(User newUser) {
		repo.save(newUser);
		return false;
	}

	@Override
	public User loginUser(User loginUser) {
		User result = new User();
		User user = repo.findByEmail(loginUser.getEmail());
		if(user != null && user.getPassword().equals(loginUser.getPassword())) {
			result = user;
		}
		return result;
	}

	
}
