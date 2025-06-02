package com.example.VotingApp;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class VotingAppApplication {

	public static void main(String[] args) {
//		SpringApplication.run(VotingAppApplication.class, args);
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("com.example.VotingApp");
		
		AuthCounter authCounter=(AuthCounter)context.getBean("ourAuthCounter");
		
		boolean flag=true;
		int republic=0;
		int democratic=0;
		int independent=0;
		
		while(flag) {
		System.out.println("Welcome to voting page:");
		Scanner sc=new Scanner(System.in);
		System.out.println("choose from below:\n1. I want to vote. \n2. see all vote(ADMIN).");
		
		int userInput=sc.nextInt();
		String beanId="";
		
		switch (userInput) {
		case 1: {
			System.out.println("Enter your username:");
			sc.nextLine();
			String userName=sc.nextLine();
			User user=(User)context.getBean("ourUser");
			user.setUserName(userName);
			
			
			System.out.println("Choose party to vote for: \n1. Republic \n2. Democratic \n3. Independent");
			
			int userInput2=sc.nextInt();
			
			switch (userInput2) {
			case 1: {
				beanId="republic";
				republic++;
				break;
			}
			case 2:{
				beanId="democratic";
				democratic++;
				break;
			}
			case 3:{
				beanId="independent";
				independent++;
				break;
			}
			
			
			}
			
			PoliticalParty party=(PoliticalParty)context.getBean(beanId);
			user.setPoliticalParty(party); //political party injected into our user
			
			//fetch userList
			UserList userList=(UserList)context.getBean("ourUserList");
			userList.addUser(user);
			
			//fetch authority counter
			
			authCounter.setUserList(userList);
			
			System.out.println("Thank you for your Vote.✅");
			System.out.println();
			
			break;
			
		}
		case 2:{
			
			authCounter.getUserList().getUserList().forEach(x->{
				System.out.println(x.getUserName()+" -> "+x.getPoliticalParty().getPartyName());
			});
			System.out.println("election over!!!😀");
			
			sc.nextLine();
			
			System.out.println("Final Result:");
//			sc.nextLine();
			int win=0;
			int[] vote= {republic,democratic,independent};
			Arrays.sort(vote);
			win=vote[2];
			if(win==republic) {
				System.out.println("Winner is republic party...😎");
			}
			else if(win==democratic) {
				System.out.println("Winner is democratic party...😎");
			}
			else if(win==independent) {
				System.out.println("Winnder is independent party...😎");
			}
			else {
				System.out.println("Election Draw...");
			}
			flag=false;
			context.close();
			break;
			
		}
		
		}
		
	}
	}

}
