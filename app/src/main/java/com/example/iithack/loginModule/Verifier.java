package com.example.iithack.loginModule;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Verifier 
{
	//String fileName = "C:\\Users\\Asus\\AndroidStudioProjects\\IITHACK\\app\\src\\main\\java\\com\\example\\iithack\\loginModule\\mockDatabase.txt";
	String fileName = "@raw/mockDatabase.txt";
	File file = new File(fileName);
	ArrayList<User> users= new ArrayList<User>()  ;

	public Verifier()
	{

	}
	
	public void initialize()
	{
		try {
			FileInputStream fstream = new FileInputStream(file);
			ObjectInputStream oStream = new ObjectInputStream(fstream);
			users = (ArrayList<User>)oStream.readObject();
		}catch (FileNotFoundException e1)
		{
			System.out.println("e1");
		}	catch (ClassNotFoundException e2)
		{
			System.out.println("e2");
		}
		catch (IOException e3)
		{
			System.out.println("e3");
		}

	}
	
	public boolean verify(String id)
	{
		System.out.println(id);

		users.toString();

		for(User user: users)
		{
			if(id.equals(user.getId()))
			{
				return true;
			}
		}

		return false;
	}
	
}
