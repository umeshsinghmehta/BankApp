package com.web.bank.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.web.bank.controller.CustomerController;
import com.web.bank.dao.CustomerDaoI;
import com.web.bank.dao.CustomerDaoImpl;
import com.web.bank.dto.Customer;

public class CustomerModelImpl implements CustomerModelI {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerModelImpl.class);
	@Override
	public String openAccount(Customer customer) {
		LOGGER.debug("CustomerModelImpl Start Servicing !!");
		CustomerDaoI coDaoI = new CustomerDaoImpl();
		// Generate Acc Number
		customer.setAccNo(generateAccNo(customer));
		LOGGER.info(generateAccNo(customer)+" :: Account No Generated  for :: "+customer.getFirstName()+" "+customer.getLastName());
		int flag = coDaoI.createCustomer(customer);
		LOGGER.debug("CustomerModelImpl End Servicing !!");
		
		if(flag!=0)
		{
			return customer.getAccNo();
		}
		return null;
	}
	
	private String generateAccNo(Customer customer)
	{
		StringBuffer accNo = new StringBuffer("");
		StringBuffer bankName = new StringBuffer("DRM");
		StringBuffer state = new StringBuffer(customer.getState());
		StringBuffer pan = new StringBuffer(customer.getPanNo());
		accNo = accNo.append(bankName).append(state).append(Integer.toString(pan.hashCode()));
		return accNo.toString();
	}
}
