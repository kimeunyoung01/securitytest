package com.example.demo.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.db.DBManager;
import com.example.demo.vo.MemberVo;

@Service
public class MemberService implements UserDetailsService {

	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		System.out.println("사용자 로그인 처리");
		MemberVo m = DBManager.selectMember(username);
		if(m == null) {
			throw new UsernameNotFoundException(username);
		}
		
		return User.builder()
				.username(username)
				.password(m.getPwd())
				.roles(m.getRole()).build();
	}

}
