package com.CIMS.Model;

public class Criminal {
	private int Criminalno;
	private String Name;
	private String Nickname;
	private int Age;
	private String Occupation;
	private String Crimetype;
	private String Address;
	private String MostWantedType;
	public int getCriminalno() {
		return Criminalno;
	}
	public void setCriminalno(int criminalno) {
		Criminalno = criminalno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNickname() {
		return Nickname;
	}
	public void setNickname(String nickname) {
		Nickname = nickname;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getCrimetype() {
		return Crimetype;
	}
	public void setCrimetype(String crimetype) {
		Crimetype = crimetype;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMostWantedType() {
		return MostWantedType;
	}
	public void setMostWantedType(String mostWantedType) {
		MostWantedType = mostWantedType;
	}
	@Override
	public String toString() {
		return "Criminal [Criminalno=" + Criminalno + ", Name=" + Name + ", Nickname=" + Nickname + ", Age=" + Age
				+ ", Occupation=" + Occupation + ", Crimetype=" + Crimetype + ", Address=" + Address
				+ ", MostWantedType=" + MostWantedType + "]";
	}
	public Criminal(int criminalno, String name, String nickname, int age, String occupation, String crimetype,
			String address, String mostWantedType) {
		super();
		Criminalno = criminalno;
		Name = name;
		Nickname = nickname;
		Age = age;
		Occupation = occupation;
		Crimetype = crimetype;
		Address = address;
		MostWantedType = mostWantedType;
	}
	

}
