package com.yueqian.VisitorServiceProvider_8200.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yueqian.VisitorServiceProvider_8200.mapper.CustomerMapper;
import com.yueqian.VisitorServiceProvider_8200.service.CustomerService;
import com.yueqian.ticketsMgr_domain_9000.domain.trip.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Resource
	private CustomerMapper custmapper;
	
	/**
	 * 旅客注册
	 */
	@Override
	public boolean addEmp(Customer customer) {
		return custmapper.addEmp(customer);
	}

	/**
	 * 根据账号获取旅客
	 */
	@Override
	public Customer getCustomerByid(String mobile) {
		return custmapper.getCustomerByid(mobile);
	}

	/**
	 * 修改旅客个人信息
	 */
	@Override
	public boolean cuschangeInfo(Customer customer) {
		return custmapper.cuschangeInfo(customer);
	}
	
	/**
	 * 修改旅客个人密碼
	 */
	@Override
	public boolean cuschangePwd(Customer customer) {
		// TODO Auto-generated method stub
		return custmapper.cuschangePwd(customer);
	}

	/**
	 * 旅客登录
	 */
	@Override
	public Customer cusLongin(Customer customer) {
		// TODO Auto-generated method stub
		return custmapper.cusLongin(customer);
	}




	

}
