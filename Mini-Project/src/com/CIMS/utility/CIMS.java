package com.CIMS.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CIMS {
	public static Connection provideConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url = "jdbc:mysql://localhost:3306/CW";
		try {
			conn = DriverManager.getConnection(url, "root", "Farheen@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}

}