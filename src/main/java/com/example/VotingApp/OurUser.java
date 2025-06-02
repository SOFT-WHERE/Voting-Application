package com.example.VotingApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ourUser")
@Scope("prototype")
public class OurUser implements User{
	
	private String userName;
	private PoliticalParty politicalParty;

	@Override
	public void setUserName(String name) {
		this.userName=name;
		
	}

	@Override
	public String getUserName() {
		
		return this.userName;
	}

	@Override
	public void setPoliticalParty(PoliticalParty party) {
		this.politicalParty=party;
		
	}

	@Override
	public PoliticalParty getPoliticalParty() {
		
		return this.politicalParty;
	}

}
