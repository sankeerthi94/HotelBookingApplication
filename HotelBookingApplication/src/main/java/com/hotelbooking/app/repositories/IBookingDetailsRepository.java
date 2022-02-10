package com.hotelbooking.app.repositories;

import java.util.List;

import com.hotelbooking.app.entities.BookingDetails;



public interface IBookingDetailsRepository {
	public BookingDetails addBookingDetails(BookingDetails bookingDetails);
	public BookingDetails updateBookingDetails(BookingDetails bookingDetails);
	public BookingDetails removeBookingDetails(BookingDetails bookingDetails);
	public List<BookingDetails> showAllBookingDetails();
	public BookingDetails showBookingDetails(BookingDetails bookingDetails);
}

