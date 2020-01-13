package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	

@Id
	
  private int addressId;
  private String city;
  private String pin;
  
  
  
 public Address() {
	
}
public Address(int addressId, String city, String pin) {
	super();
	this.addressId = addressId;
	this.city = city;
	this.pin = pin;
}
public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pin=" + pin + "]";
	}
	
}


