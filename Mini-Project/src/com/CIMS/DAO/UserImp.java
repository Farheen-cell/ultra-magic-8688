package com.CIMS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.CIMS.Exception.UserException;
import com.CIMS.Model.CrimeReport;
import com.CIMS.Model.Criminal;
import com.CIMS.Model.FIR;
import com.CIMS.Model.Feedback;
import com.CIMS.Model.User;
import com.CIMS.utility.CIMS;

public class UserImp implements UserDAO {

	@Override
	public String registerUser(User user) throws UserException {
		String result = "Not Registered...";
		try (Connection conn = CIMS.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"insert into user(name,username,password,address,pincode,phoneNumber,email) values(?,?,?,?,?,?,?)");
			ps.setString(1, user.getName());
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getAddress());
			ps.setInt(5, user.getPincode());
			ps.setInt(6, user.getPhoneNumber());
			ps.setString(7, user.getEmail());
			int x = ps.executeUpdate();
			if (x > 0) {
				result = "Registered Sucessfully..";
			} else
				throw new UserException("Invalid User Detales..");

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return result;
	}

	@Override
	public User UserLogIn(String username, String password) throws UserException {

		User user = null;

		try (Connection conn = CIMS.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from User where username=? AND password = ?");

			ps.setString(1, username);
			ps.setString(2, password);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int i = rs.getInt("userID");
				String n = rs.getString("name");
				String un = rs.getString("UserName");
				String p = rs.getString("password");
				String a = rs.getString("Address");
				int pi = rs.getInt("Pincode");
				int pn = rs.getInt("PhoneNumber");

				String e = rs.getString("Email");

				user = new User(i, n, un, p, a, pi, pn, e);

			} else
				throw new UserException("Invalid Username or password..");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return user;
	}

	@Override
	public String Crimereport(CrimeReport cr) throws UserException {
		String result = "Not Add Complaint(FIR) Report";
		try (Connection conn = CIMS.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"insert into CrimeReport(userId,Nameofinformant,Detailsofsuspect,Description,Date,status) values(?,?,?,?,?,null)");
			ps.setInt(1, cr.getUserId());
			ps.setString(2, cr.getNameOfInforment());
			ps.setString(3, cr.getDetailsofsuspect());
			ps.setString(4, cr.getDescription());
			ps.setString(5, cr.getDate());

			int x = ps.executeUpdate();
			if (x > 0) {
				result = "Add Complaint(FIR) Report Sucessfully..";
			} else
				throw new UserException("Invalid Cpmplain Detale..");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return result;
	}

	@Override
	public String EditReport(int userId, int ComplaneId, String Detailsofsuspect, String Description)
			throws UserException {
		String result = "Not Updated";
		try (Connection conn = CIMS.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"update CrimeReport set Detailsofsuspect=?,Description=? where userId=? AND CrimeNo=?;");
			ps.setString(1, Detailsofsuspect);
			ps.setString(2, Description);
			ps.setInt(3, userId);
			ps.setInt(4, ComplaneId);

			int x = ps.executeUpdate();
			if (x > 0) {
				result = "Edit Complaint(FIR) Report Sucessfully..";
			} else
				throw new UserException("Invalid userId..");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return result;
	}

	@Override
	public String changePasword(int userID, String password) throws UserException {
		String result = "Not changed.....";
		try (Connection conn = CIMS.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("update User set password=? where userId=?");
			ps.setString(1, password);
			ps.setInt(2, userID);

			int x = ps.executeUpdate();
			if (x > 0) {
				result = "Edit Passwerd Sucessfully..";
			} else
				throw new UserException("Invalid userId..");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}
		return result;
	}

	@Override
	public CrimeReport Status(int ComplaneNo) throws UserException {
		CrimeReport CR = null;

		try (Connection conn = CIMS.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from CrimeReport where CrimeNo=?");

			ps.setInt(1, ComplaneNo);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int i = rs.getInt("CrimeNo");
				int Ui = rs.getInt("userId");
				String ni = rs.getString("Nameofinformant");
				String ds = rs.getString("Detailsofsuspect");
				String d = rs.getString("Description");
				String da = rs.getString("Date");
				String st = rs.getString("Status");

				CR = new CrimeReport(i, Ui, ni, ds, d, da, st);

			} else
				throw new UserException("Invalid Complane Number..");

		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return CR;
	}

	@Override
	public FIR ViewFIRreport(int ComplaneNo) throws UserException {
		FIR fir = null;

		try (Connection conn = CIMS.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from FIR where Complaintno= ?");

			ps.setInt(1, ComplaneNo);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				String d = rs.getString("District");
				String D = rs.getString("Date");
				String t = rs.getString("Time");
				String ti = rs.getString("Typeofinformation");
				String po = rs.getString("Placeofoccurence");
				String a = rs.getString("Act");
				int fn = rs.getInt("FirNo");
				String s = rs.getString("Section");
				String pn = rs.getString("Passportno");
				int cn = rs.getInt("Complaintno");
				String p = rs.getString("Police");
				String rd = rs.getString("Receivedtime");
				String i = rs.getString("Informationrec");

				fir = new FIR(d, D, t, ti, po, a, fn, s, pn, cn, p, rd, i);

			} else
				throw new UserException("Crime report does not exist with FirNo :" + ComplaneNo);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return fir;
	}

	@Override
	public String AddFeedBack(Feedback feedback) throws UserException {
		String result = "Not Added...";
		try (Connection conn = CIMS.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement("insert Feedback values(?,?,?)");
			ps.setString(1, feedback.getName());
			ps.setString(2, feedback.getEmail());
			ps.setString(3, feedback.getMessage());

			int x = ps.executeUpdate();
			if (x > 0) {
				result = "Feedback Added Sucessfully..";
			} else
				throw new UserException("Invalid Feedback Detales..");

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}

		return result;
	}

	@Override
	public List<Criminal> viewCriminals() throws UserException {
		List<Criminal> CR = new ArrayList<>();

		try (Connection conn = CIMS.provideConnection()) {

			PreparedStatement ps = conn.prepareStatement("select * from Criminal");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				int cn = rs.getInt("Criminalno");
				String n = rs.getString("Name");
				String nk = rs.getString("Nickname");
				int a = rs.getInt("Age");
				String o = rs.getString("Occupation");
				String ct = rs.getString("Crimetype");
				String ad = rs.getString("Address");
				String mw = rs.getString("MostWantedType");

				Criminal criminal = new Criminal(cn, n, nk, a, o, ct, ad, mw);

				CR.add(criminal);

			}

		} catch (SQLException e) {

			throw new UserException(e.getMessage());
		}

		if (CR.size() == 0)
			throw new UserException("No Crime found...");

		return CR;
	}
}
