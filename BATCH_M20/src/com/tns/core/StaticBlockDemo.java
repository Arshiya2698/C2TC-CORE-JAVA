package com.tns.core;
//static block usage

public class StaticBlockDemo {

	public static void main(String[] args) {//main block executes last
		// TODO Auto-generated method stub
		System.out.println(10+20);

	}


static void m() {//static method
	System.out.println("jai hind");

}
static {//static block
	System.out.println(40+20);
m();
}
static {
	System.out.println(45+35);

}
static {
	System.out.println(45+45);

}
}