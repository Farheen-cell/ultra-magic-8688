package com.CIMS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.CIMS.Exception.UserException;
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

		User user=null;
		
		try (Connection conn= CIMS.provideConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select * from User where username=? AND password = ?");
			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				int i= rs.getInt("userID");
				String n= rs.getString("name");
				String un= rs.getString("UserName");
				String p= rs.getString("password");
				String a= rs.getString("Address");
				int pi=rs.getInt("Pincode");
				int pn=rs.getInt("PhoneNumber");
				
				String e= rs.getString("Email");
				
				
				user= new User(i,n,un,p,a,pi,pn,e);
				
			}else
				throw new UserException("Invalid Username or password..");
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new UserException(e.getMessage());
		}
		
		
		
		
		
		
		
		
		return user;
	}

}
