package com.boot.model.bean;

import java.io.Serializable;

public class GetCustomerDaoRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public GetCustomerDaoRequest(int id) {
		super();
		this.id = id;
	}
}
