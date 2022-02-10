package com.hotelbooking.app.service;

import java.util.List;

import com.hotelbooking.app.entities.FlightDetails;

public interface IFlightDetailsSErvice {
	public FlightDetails addFlightDetails(FlightDetails flightDetails);
	public FlightDetails updateFlightDetails(FlightDetails flightDetails);
	public FlightDetails removeFlightDetails(FlightDetails flightDetails);
	public List<FlightDetails> showAllFlightDetails();
	public FlightDetails showFlightDetails(int flightDetails);

}
