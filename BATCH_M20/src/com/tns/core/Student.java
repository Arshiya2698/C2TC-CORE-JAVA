package com.tns.core;
//adding student details
public class Student {

	String name;
	int roll,age;
	
	
	public Student(String name, int roll, int age) 
	{
		this.name=name;
		this.roll=roll;
		this.age=age;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student("arshiya",1,29);//object creation
		Student s2=new Student("uzma",2, 15);
		
		System.out.println(s1.name+" "+ s1.roll+" "+ s1.age);
		
		System.out.println(s2.name+" "+ s2.roll+" "+ s2.age);
		
	}

}
