package com.hotelbooking.app.service;

import java.util.List;

import com.hotelbooking.app.entities.User;

public interface IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User removeUser(User user);
	public List<User> showAllUsers();
	public User showUser(User user);
}

