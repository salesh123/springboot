package com.boot.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.boot.model.GetCustomerResponse;

public interface CustomerDetailsService {
public String getCustomer(@PathVariable int id);
	
}
