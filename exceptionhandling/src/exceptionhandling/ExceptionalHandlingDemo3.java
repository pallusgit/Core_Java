package exceptionhandling;

import java.util.Scanner;

public class ExceptionalHandlingDemo3 {

	static void validate(int age)
	{
	if(age<18)
	throw new ArithmeticException("not valid");
	else
	System.out.println("welcome to vote");
	}
	
	public static void main(String args[])
	{
		Scanner sc=new (System.in);
		System.out.println("Please eneter the age");
		int age=sc.nextInt();
		try
		{
	validate(age);
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
	System.out.println("rest of the code...");
	}
	}