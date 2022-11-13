package com.CIMS.Model;

public class MissingPerson {
	private int FIRno;
	private String nameOfPoliceStation;
	private String Datem;
	private String Dater;
	private String sex;
	private int age;
	private String complex;
	private int height;
	private String fat;
	private String IDmark;
	public int getFIRno() {
		return FIRno;
	}
	public void setFIRno(int fIRno) {
		FIRno = fIRno;
	}
	public String getNameOfPoliceStation() {
		return nameOfPoliceStation;
	}
	public void setNameOfPoliceStation(String nameOfPoliceStation) {
		this.nameOfPoliceStation = nameOfPoliceStation;
	}
	public String getDatem() {
		return Datem;
	}
	public void setDatem(String datem) {
		Datem = datem;
	}
	public String getDater() {
		return Dater;
	}
	public void setDater(String dater) {
		Dater = dater;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getComplex() {
		return complex;
	}
	public void setComplex(String complex) {
		this.complex = complex;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getFat() {
		return fat;
	}
	public void setFat(String fat) {
		this.fat = fat;
	}
	public String getIDmark() {
		return IDmark;
	}
	public void setIDmark(String iDmark) {
		IDmark = iDmark;
	}
	@Override
	public String toString() {
		return "MissingPersonList [FIRno=" + FIRno + ", nameOfPoliceStation=" + nameOfPoliceStation + ", Datem=" + Datem
				+ ", Dater=" + Dater + ", sex=" + sex + ", age=" + age + ", complex=" + complex + ", height=" + height
				+ ", fat=" + fat + ", IDmark=" + IDmark + "]";
	}
	public MissingPerson(int fIRno, String nameOfPoliceStation, String datem, String dater, String sex, int age,
			String complex, int height, String fat, String iDmark) {
		super();
		FIRno = fIRno;
		this.nameOfPoliceStation = nameOfPoliceStation;
		Datem = datem;
		Dater = dater;
		this.sex = sex;
		this.age = age;
		this.complex = complex;
		this.height = height;
		this.fat = fat;
		IDmark = iDmark;
	}
	

}
