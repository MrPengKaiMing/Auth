package com.mingge.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mingge.service.UserService;

@Controller
public class UserController {
	private static final Logger  logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@RequestMapping("/test")
	@ResponseBody
	public String test(){
		logger.info("test");
		return userService.findAll().toString();
	}
}
