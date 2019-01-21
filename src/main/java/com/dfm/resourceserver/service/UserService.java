package com.dfm.resourceserver.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dfm.resourceserver.config.UserConfig;
import com.dfm.resourceserver.model.User;

@Service
public class UserService {
	@Autowired
	UserConfig userConfig;
	
	public User getUserDetails(String id) {
		return(userConfig.getUser(id));
	}
	
	public List<User> getAllUsers(){
		return(userConfig.getUsers());
	}
	
	public List<User> addUser(User user){
		userConfig.addUser(user);
		return(userConfig.getUsers());
	}
}
