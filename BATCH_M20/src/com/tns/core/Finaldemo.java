package com.tns.core;
//demo for final method and cla
ss
public class Finaldemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class P
{
	void property()
	{
		System.out.println("house....car...money...plot");
		
	}
	final void marry()
	{
		System.out.println("arshiya");
	}
}
class C extends P{
	//cannot override final method
	void marry()
	{
		System.out.println("sultana");

	}
}