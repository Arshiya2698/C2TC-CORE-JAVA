package com.tns.core;

public class Outer {


static int x=10;
static int y=20;
static class Inner
{
	void inner_method() {
		System.out.println(x);
		System.out.println(y);

	}
	
}
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Outer.Inner obj=new Outer.Inner();
	obj.inner_method();
}
}