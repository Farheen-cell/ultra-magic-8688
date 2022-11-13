package com.CIMS.DAO;

import java.util.List;

import com.CIMS.Exception.AdminException;
import com.CIMS.Model.Admin;
import com.CIMS.Model.CrimeReport;
import com.CIMS.Model.Criminal;
import com.CIMS.Model.FIR;
import com.CIMS.Model.Feedback;


public interface AdminDAO {
	public String registerAdmin(Admin admin)throws AdminException;
	public Admin AdminLogIn(String username,String password)throws AdminException;
	public CrimeReport ViewComplanes(int complaneNo)throws AdminException;
	public String EditComplaneStatust(int complaneNo,String status)throws AdminException;
	public String PasswordChange(int AdminID,String password)throws AdminException;
	public List<Feedback> ViewUserFeedback()throws AdminException;
	public String DeletFeedback(String Name)throws AdminException;
	public String AddFIR(FIR fir)throws AdminException;
	public FIR ViewFIR(int FIRno)throws AdminException;
	public String DeleteFIR(int firNo)throws AdminException;
	public String AddCriminals(Criminal criminal)throws AdminException;
	public String deleteCriminals(String name)throws AdminException;
}
