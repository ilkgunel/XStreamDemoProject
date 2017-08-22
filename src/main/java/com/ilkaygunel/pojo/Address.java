package com.ilkaygunel.pojo;

public class Address {
	private String district;
	private String city;

	public Address() {

	}

	public Address(String district, String city) {
		this.district = district;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return district + " " + city;
	}

}
