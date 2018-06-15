package com.web.bank.model;

import java.util.ArrayList;

import com.web.bank.dao.LoginDao;
import com.web.bank.dao.LoginDaoI;

public class LoginModel {
	
	public boolean validateUser(String uName, String pass){
		
		boolean isValidate = false;
		
		LoginDaoI loginDaoI = new LoginDao();
		ArrayList<String> al = loginDaoI.getUserPassword(uName, pass);
		
		if(al != null && al.size()!=0)
		{
			if(uName.equals(al.get(0)) && pass.equals(al.get(1))){
				isValidate = true;
			}
		}
		 return isValidate;
	}

}
