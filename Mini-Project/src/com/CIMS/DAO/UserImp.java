package com.CIMS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.CIMS.Exceptions.UserException;
import com.CIMS.Model.User;
import com.CIMS.utility.CIMS;

public class UserImp implements UserDAO {

	@Override
	public String registerUser(User user) throws UserException {
		String result = "Not inserted...";
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
				result = " Registered Sucessfully..";
			}

		} catch (SQLException e) {
			// TODO: handle exception
		}

		return result;
	}

	@Override
	public User UserLogIn(String username, String password) throws UserException {
		// TODO Auto-generated method stub
		return null;
	}

}
