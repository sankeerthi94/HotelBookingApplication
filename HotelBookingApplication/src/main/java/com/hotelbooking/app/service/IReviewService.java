package com.HotelBookingApp.app.service;

import java.util.List;

import com.HotelBookingApp.app.entity.Hotel;
import com.HotelBookingApp.app.entity.Flight;
import org.springframework.stereotype.Service;

@Service
public interface IReviewService {
	
	public List<Hotel> sortByHotelRatings();
	public List<Hotel> getHotelRangeRatings(int range1, int range2);
	public List<Hotel> getReviewByHotelName(String hotelname);
	public boolean saveHotelReview(Hotel hotel);
	
	public List<Flight> sortByFlightRatings();
	public List<Flight> getFlightRangeRatings(int range1, int range2);
	public List<Flight> getReviewByFlightName(String flightlname);
	public boolean saveFlightReview(Flight flight);

}
