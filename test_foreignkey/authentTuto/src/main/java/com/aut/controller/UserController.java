package com.aut.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aut.model.User;
import com.aut.security.services.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class UserController {

	@Autowired
	protected UserService userService;
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<User> getUsers() {
		return this.userService.findAll();
	}
	
}
