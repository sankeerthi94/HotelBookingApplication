package com.hotelbooking.app.service;

import com.hotelbooking.app.entities.Admin;

public interface IAdminService {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}

