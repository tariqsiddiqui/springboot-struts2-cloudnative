package com.ecsteam.springbootstruts2oauth.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


@Configuration
@EnableWebSecurity
// @EnableOAuth2Sso

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	//@Autowired
	//@Qualifier("userDetailsService")
	//UserDetailsService userDetailsService;
	
	//@Autowired
	//DataSource dataSource;
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.authorizeRequests().antMatchers("/**", "/home", "/index","/thankyou","/templates/**","/register","/register.action").permitAll().anyRequest().authenticated().and()
		http.authorizeRequests().antMatchers("/**","/home","/restcall","/info","/health","/metrics","/login","/thankyou","/templates/**","/register","/register.action").permitAll().anyRequest().authenticated().and()
		.formLogin().permitAll()
        .loginPage("/login")
		.and().logout().permitAll();
	}
	/**
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
	**/
	@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}
}