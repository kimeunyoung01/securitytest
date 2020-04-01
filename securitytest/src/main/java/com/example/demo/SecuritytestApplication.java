package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.db.DBManager;
import com.example.demo.vo.MemberVo;

@SpringBootApplication
public class SecuritytestApplication {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	
	
	public static void main(String[] args) {
		
//		DBManager.insertBook(new MemberVo("tiger", PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("tiger"), "홍길동", "user"));
//		DBManager.insertBook(new MemberVo("master", PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("1234"), "유진탁", "ADMIN"));
		System.out.println("사용자 추가됨");
		SpringApplication.run(SecuritytestApplication.class, args);
	}

}
