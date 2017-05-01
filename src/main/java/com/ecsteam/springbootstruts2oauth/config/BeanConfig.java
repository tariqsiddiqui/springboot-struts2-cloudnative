package com.ecsteam.springbootstruts2oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ecsteam.springbootstruts2oauth.action.DeleteAction;

@Configuration
public class BeanConfig {
	
	@Bean
	public DeleteAction helloAction(){
		return new DeleteAction();
	}
}
