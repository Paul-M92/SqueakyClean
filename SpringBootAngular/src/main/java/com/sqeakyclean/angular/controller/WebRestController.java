package com.sqeakyclean.angular.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sqeakyclean.angular.model.User;
import com.sqeakyclean.angular.service.UserService;

@RestController
public class WebRestController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/api/save" , method = RequestMethod.POST)
	public ResponseEntity<User> saveEmail(@RequestBody String email){
		User user = userService.saveEmailMessage(email);
		return new ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	
	@RequestMapping("/api/test")
	public String hi() {
		return "Test Response From Bootstrap API";
	}
}
