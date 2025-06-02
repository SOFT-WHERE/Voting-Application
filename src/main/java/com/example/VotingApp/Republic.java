package com.example.VotingApp;

import org.springframework.stereotype.Component;

@Component("republic")
public class Republic implements PoliticalParty {

	private String name="republic.";
	
	@Override
	public String getPartyName() {
		
		return this.name;
	}

}
