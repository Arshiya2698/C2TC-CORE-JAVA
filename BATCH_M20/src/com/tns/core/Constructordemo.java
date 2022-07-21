package com.tns.core;

public class Constructordemo {
	
	
	String name;
	int roll;
	
	Constructordemo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Constructordemo s1=new Constructordemo("arshiya",10);//object creation
		Constructordemo s2= new Constructordemo("uzma",102);
		
		
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);

	}

}
