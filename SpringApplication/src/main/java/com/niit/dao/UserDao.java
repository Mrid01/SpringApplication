package com.niit.dao;

import java.util.List;

import com.niit.models.User;

public interface UserDao {

	void addUser(User u);

	void removeUser(String email);

	void updateUser(User u);

	List<User> getAllUsers();

	User getUser(String email);

}
