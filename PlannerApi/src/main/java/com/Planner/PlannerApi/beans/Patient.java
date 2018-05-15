package com.Planner.PlannerApi.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

@Entity
@Table(name = "PATIENT")
public class Patient {
	@Id
	@GeneratedValue
	@Column(name = "PATIENT_ID")
	private Integer patientId;
	@Column(name = "FIRSTNAME")
	private String firstname;
	@Column(name = "LASTNAME")
	private String lastname;
	@Column(name = "PHONE_NUMBER_ONE")
	private String phoneNumberOne;
	@Column(name = "PHONE_NUMBER_TWO")
	private String phoneNumberTwo;
	@Column(name = "EMAIL")
	private String email;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	@OneToMany(mappedBy = "patient", fetch = FetchType.EAGER)
	private List<Memos> memos = new ArrayList<Memos>();

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(/*Integer patientId,*/ String firstname, String lastname, String phoneNumberOne, String phoneNumberTwo,
			String email, List<Memos> memos) {
		super();
		// this.patientId = patientId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumberOne = phoneNumberOne;
		this.phoneNumberTwo = phoneNumberTwo;
		this.email = email;
		// this.address = address;
		this.memos = memos;
	}

	public Integer getPatientId() {
		return patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public String getFirstname() {
		return firstname;
	}

	@Required
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Required
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhoneNumberOne() {
		return phoneNumberOne;
	}

	@Required
	public void setPhoneNumberOne(String phoneNumberOne) {
		this.phoneNumberOne = phoneNumberOne;
	}

	public String getPhoneNumberTwo() {
		return phoneNumberTwo;
	}

	public void setPhoneNumberTwo(String phoneNumberTwo) {
		this.phoneNumberTwo = phoneNumberTwo;
	}

	public Address getAddress() {
		return address;
	}

	@Required
	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Memos> getMemos() {
		return memos;
	}

	public void setMemos(List<Memos> memos) {
		this.memos = memos;
	}

	public String getEmail() {
		return email;
	}

	@Required
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", phoneNumberOne=" + phoneNumberOne + ", phoneNumberTwo=" + phoneNumberTwo + ", email=" + email
				+ ", address=" + address +  ", memos=" + memos + "]";
	}

}
