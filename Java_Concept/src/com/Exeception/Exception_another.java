package com.Exeception;

public class Exception_another {
	public static void vote(int age) throws Throwable{
		if (age >= 18);{
			
		System.out.println("eligible for vote");
		}
	}
	else
	{
		throw new Anotherexception("ineligible to vote");
	}

	public static void main(String[] args) throws Throwable{

		vote(19);
	}
}
