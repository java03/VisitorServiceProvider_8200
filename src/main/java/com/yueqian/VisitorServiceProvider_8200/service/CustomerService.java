package com.yueqian.VisitorServiceProvider_8200.service;

import com.yueqian.ticketsMgr_domain_9000.domain.trip.Customer;

public interface CustomerService {
	
	/**
	 * 旅客注册
	 */
	public boolean addEmp(Customer customer);
	/**
	 * 旅客登录
	 */
	public Customer cusLongin(Customer customer);

	/**
	 * 根据账号获取旅客
	 */
	public Customer getCustomerByid(String mobile);
	/**
	 * 修改旅客个人信息
	 */
	public boolean cuschangeInfo(Customer customer);
	/**
	 * 修改旅客个人密碼
	 */
	public boolean cuschangePwd(Customer customer);
}
