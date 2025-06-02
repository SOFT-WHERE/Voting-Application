package com.example.VotingApp;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("ourAuthCounter")
public class OurAuthCounter implements AuthCounter{
	
	@PostConstruct
	public void init() {
		System.out.println("DB connection established...✅	");
	}

	private UserList userList;
	
	@Override
	public void setUserList(UserList userList) {
		this.userList=userList;
		
	}

	@Override
	public UserList getUserList() {
		
		return this.userList;
	}

}
