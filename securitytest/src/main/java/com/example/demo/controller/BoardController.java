package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	
	@GetMapping("/all/list")
	public String list() {
		return "list";
	}
	
	@GetMapping("/admin/cmd1")
	public String cmd1() {
		return "서비스1";
	}
	
	@GetMapping("/insert")
	public String insert() {
		return "insert";
	}
	
	
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}





