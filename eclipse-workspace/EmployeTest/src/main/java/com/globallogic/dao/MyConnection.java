package com.globallogic.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MyConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user = "root";
			String pass = "root";
			String url = "jdbc:mysql://localhost:3306/employee";
			Connection con = DriverManager.getConnection(url, user, pass);
					}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
