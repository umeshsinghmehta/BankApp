package com.web.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.web.bank.dto.Customer;

public class CustomerDaoImpl implements CustomerDaoI {

	@Override
	public int createCustomer(Customer customer) {
		Connection conn=null;
		PreparedStatement pstmt = null;
		int flag = 0;
		try {
			conn = ConnectFactory.getConnectionObject();
			String sql = "insert into acc_holders_details_mst values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getAccNo());
			pstmt.setString(2, customer.getFirstName());
			pstmt.setString(3, customer.getMiddleName());
			pstmt.setString(4, customer.getLastName());
			pstmt.setString(5, customer.getGender());
			pstmt.setString(6, customer.getDob());
			pstmt.setString(7, customer.getAddress());
			pstmt.setString(8, customer.getState());
			pstmt.setString(9, customer.getCity());
			pstmt.setString(10, customer.getPinCode());
			pstmt.setString(11, customer.getPanNo());
			pstmt.setString(12, customer.getAddharNo());
			pstmt.setString(13, customer.getMobileNo());
			pstmt.setString(14, customer.getEmail());
			pstmt.setInt(15, (customer.isRegistered()?1:0));
			
			flag = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
		finally{
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
          return flag;
	}//createCustomer

}
