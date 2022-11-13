package com.CIMS.Model;

public class CrimeReport {
	private int crimeNo;
	private int UserId;
	private String NameOfInforment;
	private String Detailsofsuspect;
	private String Description;
	private String Date;
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCrimeNo() {
		return crimeNo;
	}
	public void setCrimeNo(int crimeNo) {
		this.crimeNo = crimeNo;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getNameOfInforment() {
		return NameOfInforment;
	}
	public void setNameOfInforment(String nameOfInforment) {
		NameOfInforment = nameOfInforment;
	}
	public String getDetailsofsuspect() {
		return Detailsofsuspect;
	}
	public void setDetailsofsuspect(String detailsofsuspect) {
		Detailsofsuspect = detailsofsuspect;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "CrimeReport [crimeNo=" + crimeNo + ", UserId=" + UserId + ", NameOfInforment=" + NameOfInforment
				+ ", Detailsofsuspect=" + Detailsofsuspect + ", Description=" + Description + ", Date=" + Date
				+ ", status=" + status + "]";
	}
	public CrimeReport() {
		super();
	}
	public CrimeReport(int crimeNo, int userId, String nameOfInforment, String detailsofsuspect, String description,
			String date, String status) {
		super();
		this.crimeNo = crimeNo;
		UserId = userId;
		NameOfInforment = nameOfInforment;
		Detailsofsuspect = detailsofsuspect;
		Description = description;
		Date = date;
		this.status = status;
	}
	
}
