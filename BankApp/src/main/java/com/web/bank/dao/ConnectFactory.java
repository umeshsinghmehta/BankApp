 package com.web.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.web.bank.controller.CustomerController;

public class ConnectFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConnectFactory.class);
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3306/bank_db";
	static String userName = "root"; 
	static String password = "root";
	
	private ConnectFactory(){		
	}
	
	public static Connection getConnectionObject()
	{
		Connection conn=null;
		try {
			Class.forName(driver).newInstance();//load and  register the Driver
			
			conn = DriverManager.getConnection(url,userName,password);
			LOGGER.debug("DB Connection Created ");
		} catch (Exception e) {
			try {
				conn.close();
			} catch (Exception e2) {
				e.printStackTrace();
				LOGGER.error("Error in Estiblishing DB Connection");
			}
		}
		return conn;
	}

}
