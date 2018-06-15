package com.web.bank.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.web.bank.model.LoginModel;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uidtxt");
		String password = request.getParameter("pswtxt");
		
		request.setAttribute("userName", userName);
		request.setAttribute("password", password);
		
		RequestDispatcher rd = null; 
		
		LoginModel loginModel = new LoginModel();
		boolean validateUser = loginModel.validateUser(userName, password);
		if(validateUser){
			rd = request.getRequestDispatcher("/jsp/Success.jsp");
			rd.forward(request, response);
		}else{
			rd = request.getRequestDispatcher("/jsp/Failure.jsp");
			rd.forward(request, response);
		}
	}

}
 