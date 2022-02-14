package com.HotelBookingApp.app.service;

import java.util.List;

import com.HotelBookingApp.app.entity.Flight;
import com.HotelBookingApp.app.entity.Hotel;

public class ReviewServiceImpl implements IReviewService{

	@Override
	public List<Hotel> sortByHotelRatings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getHotelRangeRatings(int range1, int range2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getReviewByHotelName(String hotelname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveHotelReview(Hotel hotel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Flight> sortByFlightRatings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getFlightRangeRatings(int range1, int range2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> getReviewByFlightName(String flightlname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveFlightReview(Flight flight) {
		// TODO Auto-generated method stub
		return false;
	}

}
