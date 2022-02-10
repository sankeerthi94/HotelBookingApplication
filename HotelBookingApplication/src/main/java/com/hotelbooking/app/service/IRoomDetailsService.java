package com.hotelbooking.app.service;

import java.util.List;

import com.hotelbooking.app.entities.RoomDetails;

public interface IRoomDetailsService {
	public RoomDetails addRoomDetails(RoomDetails roomDetails);
	public RoomDetails updateRoomDetails(RoomDetails roomDetails);
	public RoomDetails removeRoomDetails(RoomDetails roomDetails);
	public List<RoomDetails> showAllRoomDetails();
	public RoomDetails showRoomDetails(int roomDetails_id);
}

