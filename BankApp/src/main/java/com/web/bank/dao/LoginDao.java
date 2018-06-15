package com.web.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoginDao implements LoginDaoI {

	@Override
	public ArrayList<String> getUserPassword(String uname , String psw) {
		
		Connection conn = null;
		ArrayList<String> al = new ArrayList<String>();
		
		try {
			
			conn = ConnectFactory.getConnectionObject();
			String sql = "Select * from userdetails where username = ? and userpass = ?";
			PreparedStatement pstmt  = conn.prepareStatement(sql);
			pstmt.setString(1,uname );
			pstmt.setString(2, psw);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				String dbUser = rs.getString("username");
				String dbPass = rs.getString("userpass");
				al.add(dbUser);
				al.add(dbPass);
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
         return al;
	}

}
