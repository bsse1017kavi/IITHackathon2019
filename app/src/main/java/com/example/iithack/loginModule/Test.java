package com.example.iithack.loginModule;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test
{
	public static void main(String[] args)throws FileNotFoundException,IOException,ClassNotFoundException
	{
		Scanner sc = new Scanner(System.in);
		String s;
		Verifier verifier = new Verifier();
		verifier.initialize();

		while (true)
		{
			s = sc.nextLine();
			if(verifier.verify(s))
			{
				System.out.println("Get in");
			}

			else System.out.println("Get out");
		}

		/*DatabaseTester tester = new DatabaseTester();
		tester.initialize();
		tester.createDatabase();*/
	}
}
