package com.tns.core;

public class Staticvariabledemo {

		// TODO Auto-generated method stub
String name;//object bound
int roll;//object bound
static String coll="kbn";//class bound
void display()
{
	System.out.println(name+" "+roll+" "+coll);
}

static void modify() {
	String coll="vtu college";
}


	public Staticvariabledemo(String name,int roll) {
		
		// TODO Auto-generated constructor stub
		super();
		this.name=name;
		this.roll=roll;
	}
	public static void main(String[] args) {
		Staticvariabledemo s1=new Staticvariabledemo("arshiya",1);
		Staticvariabledemo s2=new Staticvariabledemo("uzma",2);
		 Staticvariabledemo.modify();
		s1.display();
		s2.display();
	  
	}

}
