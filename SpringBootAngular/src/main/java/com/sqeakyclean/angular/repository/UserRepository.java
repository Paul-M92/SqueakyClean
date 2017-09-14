package com.sqeakyclean.angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sqeakyclean.angular.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
