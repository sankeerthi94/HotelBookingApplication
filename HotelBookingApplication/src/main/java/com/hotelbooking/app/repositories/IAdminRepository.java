package com.hotelbooking.app.repositories;

import com.hotelbooking.app.entities.Admin;

public interface IAdminRepository {
	public Admin signIn(Admin admin);
	public Admin signOut(Admin admin);
	
}
