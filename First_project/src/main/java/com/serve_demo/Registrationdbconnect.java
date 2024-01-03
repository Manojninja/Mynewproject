package com.serve_demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import jakarta.servlet.Registration;

public class Registrationdbconnect {
	public static int register(Registration_details registration)
    {
        String query = "insert into registrationform(firstname,lastname,email,password,address) values(?,?,?,?,?)";
        int count =0;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servelet","root","Mg1235789#");
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, registration.getFirstname());
            ps.setString(2, registration.getLastname());
            ps.setString(3, registration.getEmail());
            ps.setString(4, registration.getPassword());
            ps.setString(5, registration.getAddress());
               
            System.out.println(ps);
            count = ps.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return count;
    }
}
