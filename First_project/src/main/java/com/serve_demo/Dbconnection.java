package com.serve_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
public static Connection getConnection() throws SQLException, ClassNotFoundException
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servelet","root","Mg1235789#");
	return con;
	
}
}
