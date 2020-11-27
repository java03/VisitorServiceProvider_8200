package com.yueqian.VisitorServiceProvider_8200.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yueqian.VisitorServiceProvider_8200.service.CustomerService;
import com.yueqian.ticketsMgr_domain_9000.domain.trip.Customer;
import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.Station;
@RestController
@RequestMapping("/cus")
public class CustomerController {
	@Resource
	private CustomerService cusservice;
	
	
	@RequestMapping("/register")
	public String regEmp(@RequestBody Customer customer) {
		Customer fl = cusservice.getCustomerByid(customer.getMobile());//判断是否已有该账号注册
		if(fl!=null) {
			return "exists";
		}
		boolean flag = cusservice.addEmp(customer);//判断是否添加成功
		System.out.println(flag);
		if(flag) {
			return "success";
		}else {
			return "failed";
		}
	}
	@RequestMapping("/login")
	public Customer cusLogin(@RequestBody Customer customer) {
		Customer fl = cusservice.getCustomerByid(customer.getMobile());
		if(!customer.getMobile().equals("")&&!customer.getPwd().equals("")){
			if(fl!=null&&customer.getPwd().equals(fl.getPwd())) {
				return fl;
			}else {
				return null;
			}
			}
		return null;
	}
	
	
	@RequestMapping("/showInfo")
	public Customer showInfo(String mobile) {
		return cusservice.getCustomerByid("mobile");
	}	
	@RequestMapping("/changeInfo")
	public String changeInfo(@RequestBody Customer customer) {
		boolean flag = cusservice.cuschangeInfo(customer);//判断个人信息是否修改成功
		System.out.println(flag);
		if(flag) {
			return "success";
		}
			return "failed";
		}
	@RequestMapping("/changePwd")
	public String changePwd(@RequestBody Customer customer) {
			boolean flag = cusservice.cuschangePwd(customer);//判密碼是否修改成功
			if(flag) {
				return "success";
			}else {
				return "failed";
			}
	}
	
	

	
}


