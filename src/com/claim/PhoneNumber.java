package com.claim;

public class PhoneNumber {
	private String phoneNumber;
	public PhoneNumber() {
		this("");
	}
	public PhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String toString(){
		return phoneNumber;
	}
}
