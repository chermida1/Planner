package com.Planner.PlannerApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Planner.PlannerApi.beans.User;
import com.Planner.PlannerApi.service.UserService;

@RestController
public class UserCtrl {
	@Autowired
	UserService userService;

	@GetMapping("/getAllUsers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/createUser")
	public void createUser(@RequestBody User newUser) {
		userService.addUser(newUser);
	}

	@PostMapping()
	public ResponseEntity<User> loginUser(@RequestBody User loginUser) {
		User currentUser = userService.loginUser(loginUser);
		if (currentUser.getUserId() > 0) {
			// return new ResponseEntity<DrailUserDTO>(new DrailUserDTO(currentUser), HttpStatus.ACCEPTED);
			return new ResponseEntity<User>(currentUser,HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<User>(currentUser,HttpStatus.UNAUTHORIZED);
	}

}
