package com.CIMS.Model;

public class FIR {
	private String District;
	private String Date;
	private String Time;
	private String Typeofinformation;
	private String Placeofoccurence;
	private String Act;
	private int Firno;
	private String Section;
	private String Passportno;
	private int Complaintno;
	private String Police;
	private String Receivedtime;
	private String Informationrec;
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getTypeofinformation() {
		return Typeofinformation;
	}
	public void setTypeofinformation(String typeofinformation) {
		Typeofinformation = typeofinformation;
	}
	public String getPlaceofoccurence() {
		return Placeofoccurence;
	}
	public void setPlaceofoccurence(String placeofoccurence) {
		Placeofoccurence = placeofoccurence;
	}
	public String getAct() {
		return Act;
	}
	public void setAct(String act) {
		Act = act;
	}
	public int getFirno() {
		return Firno;
	}
	public void setFirno(int firno) {
		Firno = firno;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getPassportno() {
		return Passportno;
	}
	public void setPassportno(String passportno) {
		Passportno = passportno;
	}
	public int getComplaintno() {
		return Complaintno;
	}
	public void setComplaintno(int complaintno) {
		Complaintno = complaintno;
	}
	public String getPolice() {
		return Police;
	}
	public void setPolice(String police) {
		Police = police;
	}
	public String getReceivedtime() {
		return Receivedtime;
	}
	public void setReceivedtime(String receivedtime) {
		Receivedtime = receivedtime;
	}
	public String getInformationrec() {
		return Informationrec;
	}
	public void setInformationrec(String informationrec) {
		Informationrec = informationrec;
	}
	@Override
	public String toString() {
		return "FIR [District=" + District + ", Date=" + Date + ", Time=" + Time + ", Typeofinformation="
				+ Typeofinformation + ", Placeofoccurence=" + Placeofoccurence + ", Act=" + Act + ", Firno=" + Firno
				+ ", Section=" + Section + ", Passportno=" + Passportno + ", Complaintno=" + Complaintno + ", Police="
				+ Police + ", Receivedtime=" + Receivedtime + ", Informationrec=" + Informationrec + "]";
	}
	public FIR(String district, String date, String time, String typeofinformation, String placeofoccurence, String act,
			int firno, String section, String passportno, int complaintno, String police, String receivedtime,
			String informationrec) {
		super();
		District = district;
		Date = date;
		Time = time;
		Typeofinformation = typeofinformation;
		Placeofoccurence = placeofoccurence;
		Act = act;
		Firno = firno;
		Section = section;
		Passportno = passportno;
		Complaintno = complaintno;
		Police = police;
		Receivedtime = receivedtime;
		Informationrec = informationrec;
	}
	

}
