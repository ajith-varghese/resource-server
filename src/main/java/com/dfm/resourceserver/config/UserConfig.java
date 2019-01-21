package com.dfm.resourceserver.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.dfm.resourceserver.model.User;

@Configuration
public class UserConfig {
	private List<User> users;
	
	public UserConfig() {
		this.users = createUsersList();
	}

	private List<User> createUsersList(){
		List<User> l = new ArrayList<User>();
		l.add(createUser("1", "Ajith", "Varghese", 40, "Male"));
		l.add(createUser("2", "John", "Thomas", 34, "Male"));
		l.add(createUser("3", "Tom", "Nixon", 44, "Male"));
		l.add(createUser("4", "Linda", "Patterson", 50, "Female"));
		return(l);
	}
	
	private User createUser(String id, String firstName, String lastName, int age, String gender) {
		User u = new User();
		u.setAge(age);
		u.setEmployeeId(id);
		u.setFirstName(firstName);
		u.setGender(gender);
		u.setLastName(lastName);
		return(u);
	}
	
	public User getUser(String id) {
		User u = this.users.stream()
							.filter(user -> user.getEmployeeId().equals(id))
							.findAny()
			                .orElse(null);
		return(u);
	}
	
	public List<User> getUsers(){
		return(this.users);
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
}
