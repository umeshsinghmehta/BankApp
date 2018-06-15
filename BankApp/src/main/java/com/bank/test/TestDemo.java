package com.bank.test;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Acc No = "+generateAccNo());
	}
	
	public static String generateAccNo()
	{
		StringBuffer accNo = new StringBuffer("");
		StringBuffer bankName = new StringBuffer("DRM");
		StringBuffer state = new StringBuffer("RJ");
		StringBuffer pan = new StringBuffer("ALUPB2345M");
		accNo = accNo.append(bankName).append(state).append(Integer.toString(pan.hashCode()));
		return accNo.toString();
	}

}
