package com.CIMS.Model;

public class User {
	private int userID;
	private String name;
	private String UserName;
	private String password;
	private String Address;
	private int Pincode;
	private int PhoneNumber;
	private String Email;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", UserName=" + UserName + ", password=" + password
				+ ", Address=" + Address + ", Pincode=" + Pincode + ", PhoneNumber=" + PhoneNumber + ", Email=" + Email
				+ "]";
	}
	public User() {
		super();
	}
	public User(int userID, String name, String userName, String password, String address, int pincode, int phoneNumber,
			String email) {
		super();
		this.userID = userID;
		this.name = name;
		UserName = userName;
		this.password = password;
		Address = address;
		Pincode = pincode;
		PhoneNumber = phoneNumber;
		Email = email;
	}
	
	

}
