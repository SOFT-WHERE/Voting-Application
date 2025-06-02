package com.example.VotingApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component("ourUserList")
public class OurUserList implements UserList{
	
	User user;
	List<User> ls;
	
	public OurUserList() {
		this.ls=new ArrayList<User>();
	}

	@Override
	public void addUser(User user) {
		ls.add(user);
		
	}

	@Override
	public List<User> getUserList() {
		
		return this.ls;
	}

}
