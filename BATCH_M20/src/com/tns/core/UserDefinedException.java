package com.tns.core;

import java.util.Scanner;

public class UserDefinedException {

	public static void main(String[] args) throws Cantvote {
		// TODO Auto-generated method stub
int age;
System.out.println("Enter the age");
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
if(age>18)
{
	System.out.println("you can vote");
}
			 else {
			throw new Cantvote("u canot cast the vote");//unchecked exception
	}
	}
}
class Cantvote extends RuntimeException //printstacktrace
{
	public Cantvote(String msg) {
		
	
	super(msg);
	}
	
}
