package com.example.VotingApp;

public interface User {
	
	void setUserName(String name);
	String getUserName();
	void setPoliticalParty(PoliticalParty party);
	PoliticalParty getPoliticalParty();

}
