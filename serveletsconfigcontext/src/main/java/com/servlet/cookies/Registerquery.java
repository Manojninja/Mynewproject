package com.servlet.cookies;

import java.sql.*;
import java.sql.SQLException;



public class Registerquery {

	public int insert(String firstname, String lastname, String email, String password,
		String address) throws ClassNotFoundException, SQLException
	{
		Connection con =Dbconnection.getConnection();
		String query="insert into registrationform values('" +firstname+"','" +lastname+"','" +email+"','" +password+"','" +address+"')";
		Statement stmt=con.createStatement();
		int count=stmt.executeUpdate(query);
		
		return count;
		
	}
	public int update(String firstname, String lastname, String email, String password,
			String address) throws ClassNotFoundException, SQLException
		{
			Connection con =Dbconnection.getConnection();
			String query="update  registrationform set firstname('" +firstname+"','" +lastname+"','" +email+"','" +password+"','" +address+"'where firstname='"+firstname+"')";
			Statement stmt=con.createStatement();
			int count=stmt.executeUpdate(query);
			
			return count;
			
		}
}
