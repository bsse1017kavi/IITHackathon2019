package com.example.iithack.loginModule;

import java.io.Serializable;

public class User implements Serializable
{
	String id;
	
	public User(String id) 
	{
		super();
		this.id = id;
	}



	public String getId() {
		return id;
	}
	
}
