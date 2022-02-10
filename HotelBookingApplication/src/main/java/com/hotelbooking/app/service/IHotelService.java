package com.hotelbooking.app.service;

import java.util.List;

import com.hotelbooking.app.entities.Hotel;

public interface IHotelService {
	public Hotel addHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	public Hotel removeHotel(Hotel hotel);
	public List<Hotel> showAllHotels();
	public Hotel showHotel(Hotel id);
}

