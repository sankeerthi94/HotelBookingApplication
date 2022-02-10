package com.hotelbooking.app.repositories;

import java.util.List;

import com.hotelbooking.app.entities.Flight;

public interface IFlightRepository {
	public Flight addHotel(Flight flight);
	public Flight updateHotel(Flight flight);
	public Flight removeHotel(Flight flight);
	public List<Flight> showAllFlight();
	public Flight showHotel(Flight id);

}
