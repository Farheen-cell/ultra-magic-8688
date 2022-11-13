package com.CIMS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.CIMS.Exception.AdminException;
import com.CIMS.Exception.UserException;
import com.CIMS.Model.Admin;
import com.CIMS.Model.User;
import com.CIMS.utility.CIMS;

public class AdminImp implements AdminDAO{

	@Override
	public String registerAdmin(Admin admin) throws AdminException {
		String result = "Not inserted...";
		try (Connection conn = CIMS.provideConnection()) {
			PreparedStatement ps = conn.prepareStatement(
					"insert into admin(username,password,name,designation,officialAddress,officalPhone,residentialAddress,pincode,phone,email) values(?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());
			ps.setString(3, admin.getName());
			ps.setString(4, admin.getDesignation());
			ps.setString(5, admin.getOfficialAddress());
			ps.setInt(6, admin.getOfficalPhone());
			ps.setString(7, admin.getResidentialAddress());
			ps.setInt(8, admin.getPhone());
			ps.setString(9, admin.getEmail());
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
	public Admin AdminLogIn(String username, String password) throws AdminException {
Admin admin=null;
		
		try (Connection conn= CIMS.provideConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select * from admin where username=? AND password = ?");
			
			
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				int i= rs.getInt("AdminID");
				String un= rs.getString("UserName");
				String p= rs.getString("password");
				String n= rs.getString("name");
				String d= rs.getString("Designation");
				String oa= rs.getString("OfficialAddress");
				int op=rs.getInt("OfficalPhone");
				String ra= rs.getString("ResidentialAddress");
				int pi=rs.getInt("Pincode");
				int pn=rs.getInt("Phone");
				String e= rs.getString("Email");
			admin= new Admin(i,un,p,n,d,oa,op,ra,pi,pn,e);
				
			}else
				throw new AdminException("Invalid Username or password..");
		
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AdminException(e.getMessage());
		}
		
		
		return admin;
	}

}
