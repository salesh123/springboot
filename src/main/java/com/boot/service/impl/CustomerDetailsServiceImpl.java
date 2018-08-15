package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.service.CustomerDetailsDao;
import com.boot.model.bean.GetCustomerDaoRequest;
import com.boot.service.CustomerDetailsService;


@RestController
public class CustomerDetailsServiceImpl{

	/*@Autowired
	private CustomerDetailsDao customerDetailsDao;*/
	
	
	@RequestMapping(value="/customer",method=RequestMethod.GET)
	//public String getCustomer(int id) {
	public String getCustomer() {
		/*// TODO Auto-generated method stub
		GetCustomerDaoRequest customerRequest=new GetCustomerDaoRequest(id);
		//customerRequest.setId(id);
		String response=customerDetailsDao.getCustomeDetails(customerRequest);
		return response;*/
		return "boot";
	}
}
