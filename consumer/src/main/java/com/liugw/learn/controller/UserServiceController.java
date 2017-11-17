package com.liugw.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liugw.provider.service.dubbotest.UserService;

@Controller
public class UserServiceController {

	@Autowired
	UserService userService;

	@RequestMapping("/user")
	@ResponseBody
	public void getUser() {
		System.out.println("Start query the user.");
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
