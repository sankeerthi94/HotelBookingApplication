package com.capg.pro.entity;

import java.util.Objects;

public class Flight {
	
	private int flight_id;
	private String flight_name;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getFlight_id() {
		return flight_id;
	}
	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(flight_id, flight_name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flight other = (Flight) obj;
		return flight_id == other.flight_id && Objects.equals(flight_name, other.flight_name);
	}
	
	@Override
	public String toString() {
		return "Flight [flight_id=" + flight_id + ", flight_name=" + flight_name + "]";
	}

}

