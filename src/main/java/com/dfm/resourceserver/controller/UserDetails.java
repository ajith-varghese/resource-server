package com.dfm.resourceserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dfm.resourceserver.model.User;
import com.dfm.resourceserver.service.UserService;



@RestController
public class UserDetails {
	@Autowired
	UserService userService;
	
	@GetMapping("/user/{id}")
	User getUserDetails(@PathVariable String id) {
		return(userService.getUserDetails(id));
	}
	
	@GetMapping("/users")
	List<User> getUsers() {
		return(userService.getAllUsers());
	}
			
	@PostMapping("/adduser")
	List<User> addUser(@RequestBody User user) {
		return(userService.addUser(user));
	}
}
