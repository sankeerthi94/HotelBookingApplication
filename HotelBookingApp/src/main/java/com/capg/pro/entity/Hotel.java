package com.capg.pro.entity;

import java.util.Objects;

public class Hotel {
	
	private int hotel_id;
	private String city;
	private String hotel_name;
	private String address;
	private String description;
	private double avg_rate_per_day;
	private String email;
	private String phone1;
	private String phone2;
	private String website;
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAvg_rate_per_day() {
		return avg_rate_per_day;
	}
	public void setAvg_rate_per_day(double avg_rate_per_day) {
		this.avg_rate_per_day = avg_rate_per_day;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, avg_rate_per_day, city, description, email, hotel_id, hotel_name, phone1, phone2,
				website);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(address, other.address)
				&& Double.doubleToLongBits(avg_rate_per_day) == Double.doubleToLongBits(other.avg_rate_per_day)
				&& Objects.equals(city, other.city) && Objects.equals(description, other.description)
				&& Objects.equals(email, other.email) && hotel_id == other.hotel_id
				&& Objects.equals(hotel_name, other.hotel_name) && Objects.equals(phone1, other.phone1)
				&& Objects.equals(phone2, other.phone2) && Objects.equals(website, other.website);
	}
	
	@Override
	public String toString() {
		return "Hotel [hotel_id=" + hotel_id + ", city=" + city + ", hotel_name=" + hotel_name + ", address=" + address
				+ ", description=" + description + ", avg_rate_per_day=" + avg_rate_per_day + ", email=" + email
				+ ", phone1=" + phone1 + ", phone2=" + phone2 + ", website=" + website + "]";
	}

}
