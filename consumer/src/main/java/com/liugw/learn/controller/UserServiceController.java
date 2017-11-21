package com.liugw.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liugw.provider.service.dubbotest.StudentService;
import com.liugw.provider.service.dubbotest.UserService;

@Controller
public class UserServiceController {

	@Autowired
	UserService userService;

	@Autowired
	StudentService studentService;

	@RequestMapping("/user/{userid}")
	@ResponseBody
	public String getUser(@PathVariable int userid) {
		System.out.println("Start query the user. " + userid);
		String user = userService.getUserNamebyId(userid);
		return user;
	}

	@RequestMapping("/student/{userid}")
	@ResponseBody
	public String getStudent(@PathVariable String userid) {
		System.out.println("Start query the user. " + userid);
		String user = studentService.getUserNamebyId(userid) + ":" + studentService.getSexByUserId(userid) + ":"
				+ studentService.getScoreByUserId(userid);
		return user;
	}

	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		return "index";
	}
}
