package com.hotelbooking.app.service;

import java.util.List;

import com.hotelbooking.app.entities.Flight;

public interface IFlightService {
	public Flight addHotel(Flight flight);
	public Flight updateHotel(Flight flight);
	public Flight removeHotel(Flight flight);
	public List<Flight> showAllFlight();
	public Flight showHotel(Flight id);
	
	

}
