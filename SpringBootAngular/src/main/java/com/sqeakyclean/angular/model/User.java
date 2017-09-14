package com.sqeakyclean.angular.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="web_user", schema="mailer_module")
public class User implements Serializable{
	
	private static final long serialVersionUID = 6637087385433228063L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id", unique=true, nullable=false)
	private Long id;
	
	@Column(name="user_email", unique=true, length = 50, nullable=false)
	private String email;
	
	@Column(name="is_subscribed", columnDefinition="boolean NOT NULL DEFAULT false", nullable=false)
	private boolean is_subscribed;
	
	//Setters and Getters
	public User() {
		super();
	}
	
	public User(Long id, String email, boolean is_subscribed) {
		this.id = id;
		this.email = email;
		this.is_subscribed = is_subscribed;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", is_subscribed" + is_subscribed + "]";
	}
	
	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (id == null || obj == null || getClass() != obj.getClass())
			return false;
		User toCompare = (User) obj;
		return id.equals(toCompare.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isIs_subscribed() {
		return is_subscribed;
	}

	public void setIs_subscribed(boolean is_subscribed) {
		this.is_subscribed = is_subscribed;
	}
}


