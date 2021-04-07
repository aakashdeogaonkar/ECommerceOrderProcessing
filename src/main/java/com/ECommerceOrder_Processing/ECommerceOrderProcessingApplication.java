package com.ECommerceOrder_Processing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
// public class ECommerceOrderProcessingApplication implements CommandLineRunner {
public class ECommerceOrderProcessingApplication {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(ECommerceOrderProcessingApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO grocery (id, name) VALUES(1, 'Fruits')";
//		jdbcTemplate.update(sql);
//	}
}