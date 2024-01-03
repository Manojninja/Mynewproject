package com.serve_demo;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Registration_details rd=new Registration_details();
		Registrationdbconnect rdb=new Registrationdbconnect();
		Myfirrst mf=new Myfirrst();
		
		rdb.insert(null, null, null, null, null);
	}

}
