package com.capstrone.coach.dto;

import com.capstrone.coach.entity.Coach;

public class CoachResponse {

	private String id;
	private String name;
	private String mobileNumber;
	private String dateOfBirth;
	private String gender;
	private String speciality;
	
	public CoachResponse(Coach coach) {
		this.id = coach.getId();
		this.name = coach.getName();
		this.dateOfBirth = coach.getDateOfBirth();
		this.mobileNumber = coach.getMobileNumber();
		this.speciality = coach.getSpeciality();
		this.gender = coach.getGender();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
