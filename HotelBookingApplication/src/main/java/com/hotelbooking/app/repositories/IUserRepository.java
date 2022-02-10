package com.hotelbooking.app.repositories;

import java.util.List;

import com.hotelbooking.app.entities.User;

public interface IUserRepository {
	public User addUser(User user);
	public User updateUser(User user);
	public User removeUser(User user);
	public List<User> showAllUsers();
	public User showUser(User user);
}

