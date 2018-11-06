package com.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class BookApplication extends SpringBootServletInitializer{

	// Support for use JSP
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BookApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
		
	}
	
	// Khoi tao bean de ket noi DB
	@Bean
	public DriverManagerDataSource getConnection() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		
		datasource.setUrl("jdbc:mysql://localhost:3306/bookstore?useSSL=false&useUnicode=true&characterEncoding=UTF-8");
		datasource.setUsername("root");
		datasource.setPassword("root");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		
		return datasource;
		
	}
}
