package com.example.iithack.loginModule;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DatabaseTester
{
	String fileName = "C:\\Users\\Asus\\AndroidStudioProjects\\IITHACK\\app\\src\\main\\java\\com\\example\\iithack\\loginModule\\mockDatabase.txt";
	File file = new File(fileName); 
	
	private ArrayList<User> users;
	
	public DatabaseTester()
	{
		
	}
	
	public void initialize()
	{
		User user1 = new User("iit123");
		User user2 = new User("kavi12");
		User user3 = new User("brac234");
		
		users = new ArrayList<User>();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}
	
	public void createDatabase()throws FileNotFoundException,IOException
	{
		FileOutputStream fstream = new FileOutputStream(file);
		ObjectOutputStream oStream = new ObjectOutputStream(fstream);
		
		oStream.writeObject(users);
	}
}
