package com.hotelbooking.app.entities;

import java.sql.Blob;

public class FlightDetails {
	
	private int flight_id;
	private int company_id;
	private String toCity;
	private String fromCity;
	private double ticketPrice;
	private boolean isAvailable;
	private Blob photo;

}
