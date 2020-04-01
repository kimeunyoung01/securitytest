package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.vo.MemberVo;

@Controller
public class IndexController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("user", new MemberVo("tiger", "tiger", "홍길동", "user"));
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
//		model.addAttribute("user", new MemberVo("tiger", "tiger", "홍길동", "user"));
		return "login";
	}
	
	@GetMapping("/logoutOK")
	public String logoutOK() {
//		model.addAttribute("user", new MemberVo("tiger", "tiger", "홍길동", "user"));
		return "logoutOK";
	}
}
