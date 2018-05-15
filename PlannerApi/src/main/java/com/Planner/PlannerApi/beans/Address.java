package com.Planner.PlannerApi.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private Integer addressId;
	@Column(name = "ADDRESS_STREET", nullable = false, length = 250)
	private String street;
	@Column(name = "ADDRESS_CITY", nullable = false, length = 50)
	private String city;
	@Column(name = "ADDRESS_STATE", nullable = false, length = 50)
	private String state;
	@Column(name = "ADDRESS_ZIPCODE", nullable = false, length = 10)
	private String zipcode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(/*long addressId,*/ String street, String city, String state, String zipcode) {
		/*this.addressId = addressId;*/
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + "]";
	}

}
