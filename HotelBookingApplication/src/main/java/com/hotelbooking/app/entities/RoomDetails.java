package com.hotelbooking.app.entities;

import java.sql.Blob;

public class RoomDetails {
	private int room_id;
	private int hotel_id;
	private String room_no;
	private String room_type;
	private double rate_per_day;
	private boolean isAvailable;
	private Blob photo;
}
