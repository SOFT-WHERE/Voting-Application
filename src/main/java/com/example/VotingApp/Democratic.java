package com.example.VotingApp;

import org.springframework.stereotype.Component;

@Component("democratic")
public class Democratic implements PoliticalParty {

	private String name="democratic.";
	
	@Override
	public String getPartyName() {
		
		return this.name;
	}

}
