package com.sqeakyclean.angular.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqeakyclean.angular.model.User;
import com.sqeakyclean.angular.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User saveEmailMessage(String email) {
		User temp = new User();
		temp.setEmail(email);
		temp.setIs_subscribed(true);
		return userRepository.save(temp);
	}
	
}
