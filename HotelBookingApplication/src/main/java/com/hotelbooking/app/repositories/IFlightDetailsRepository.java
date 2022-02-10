package com.hotelbooking.app.repositories;

import java.util.List;

import com.hotelbooking.app.entities.FlightDetails;



public interface IFlightDetailsRepository {
	public FlightDetails addFlightDetails(FlightDetails flightDetails);
	public FlightDetails updateFlightDetails(FlightDetails flightDetails);
	public FlightDetails removeFlightDetails(FlightDetails flightDetails);
	public List<FlightDetails> showAllFlightDetails();
	public FlightDetails showFlightDetails(int flightDetails);

}
