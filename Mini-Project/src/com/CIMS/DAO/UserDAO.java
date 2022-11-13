package com.CIMS.DAO;

import java.util.List;

import com.CIMS.Exception.UserException;
import com.CIMS.Model.User;
import com.CIMS.Model.CrimeReport;
import com.CIMS.Model.Criminal;
import com.CIMS.Model.FIR;
import com.CIMS.Model.Feedback;

public interface UserDAO {
	public String registerUser(User user)throws UserException;
	public User UserLogIn(String username,String password)throws UserException;
	public String Crimereport(CrimeReport cr)throws UserException;
	public String EditReport(int userId,int ComplaneId,String Detailsofsuspect,String Description)throws UserException;
	public String changePasword(int userID,String pw)throws UserException;
	public CrimeReport Status(int ComplaneNo)throws UserException;
	public FIR ViewFIRreport(int ComplaneNo)throws UserException;
	public String AddFeedBack(Feedback feedback)throws UserException;
	public List<Criminal> viewCriminals()throws UserException;

}
