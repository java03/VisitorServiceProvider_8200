package com.yueqian.VisitorServiceProvider_8200;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yueqian.VisitorServiceProvider_8200.mapper")
public class VisitorServiceProvider8200Application {

	public static void main(String[] args) {
		SpringApplication.run(VisitorServiceProvider8200Application.class, args);
	}

}
