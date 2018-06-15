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

import com.web.bank.dto.Customer;
import com.web.bank.model.CustomerModelI;
import com.web.bank.model.CustomerModelImpl;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	private static final long serialVersionUID = 1L;
	public Customer customer = null;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LOGGER.debug("CustomerController Start Servicing !!");
		CustomerModelI cuModelI = new CustomerModelImpl();
		RequestDispatcher rd = null;
		
		//Genearte Account No
		customer = new Customer();
		
		customer.setFirstName(request.getParameter("fname"));
		customer.setMiddleName(request.getParameter("mname"));
		customer.setLastName(request.getParameter("lname"));
		customer.setGender(request.getParameter("gender"));
		customer.setDob(request.getParameter("dob"));
		customer.setAddress(request.getParameter("address"));
		customer.setState(request.getParameter("state"));
		customer.setCity(request.getParameter("city"));
		customer.setPinCode(request.getParameter("pincode"));
		customer.setAddharNo(request.getParameter("addhar"));
		customer.setPanNo(request.getParameter("pan"));
		customer.setMobileNo(request.getParameter("mobile"));
		customer.setEmail(request.getParameter("email"));
		
		String accNo = cuModelI.openAccount(customer);
		request.setAttribute("accNo", accNo);
		request.setAttribute("userName", getCustomerFullName(customer));
		
		if(accNo!=null){
			rd = request.getRequestDispatcher("/jsp/AccCreationResponsePage.jsp");
			rd.forward(request, response);
			LOGGER.info("Customer Created Successfully !!");
		}else{
			rd = request.getRequestDispatcher("/jsp/Failure.jsp");
			LOGGER.info("Customer Failed to Create !!");
			rd.forward(request, response);
		}
		LOGGER.debug("CustomerController End Servicing !!");
	}//
	
	public  String getCustomerFullName(Customer customer){
		String fullName= null;
		if(customer.getMiddleName() != null){
			fullName = customer.getFirstName()+" "+customer.getMiddleName()+" "+customer.getLastName();
		}else{
			fullName = customer.getFirstName()+" "+customer.getLastName();
		}				
		return fullName;
	}

}
