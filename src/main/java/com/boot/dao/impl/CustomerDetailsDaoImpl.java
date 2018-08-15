package com.boot.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.dao.service.CustomerDetailsDao;
import com.boot.model.bean.GetCustomerDaoRequest;
import com.boot.model.bean.GetCustomerDaoResponse;

public class CustomerDetailsDaoImpl implements CustomerDetailsDao{

	@Autowired
	private CustomerDetailsDao customerDetailsDao1;
	
	@Override
	public String getCustomeDetails(GetCustomerDaoRequest getCustomerDaoRequest) 
	{
		String str;
		// TODO Auto-generated method stub
		if(getCustomerDaoRequest.getId()==1){
		str="salesh";
		return str;
		}else{
		 str="error";
		}
		return str;

	
	}

}
