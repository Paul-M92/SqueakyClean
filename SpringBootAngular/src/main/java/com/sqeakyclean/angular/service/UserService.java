package com.sqeakyclean.angular.service;

import com.sqeakyclean.angular.model.User;

public interface UserService {
	User save(User user);
	User saveEmailMessage(String email);
}
