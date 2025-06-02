Overview:
This is a simple Java-based voting application that allows users to:
Cast votes for political parties (Republic, Democratic, Independent)
View voting results (admin feature)
Track vote counts and determine the winning party

Prerequisites:
Java JDK 8 or later
Maven (for dependency management)
Spring Framework (included in pom.xml)

Technical Details:
Uses Spring's AnnotationConfigApplicationContext for dependency injection
Implements basic bean management for users and parties
Simple console-based interface using Scanner
Vote counting logic with winner determination

Code Structure:
Main class: VotingAppApplication.java
Beans configured through Spring context
Three political party options implemented as beans
User management through UserList bean

Limitations:
Console-based interface (no GUI)
No persistent storage (votes reset when program ends)
Basic authentication (no real security)

Future Enhancements:
Add database persistence
Implement proper user authentication
Create a web-based interface
Add more detailed voting statistics
