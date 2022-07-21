package com.tns.core;

public class Continuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		do
		{	x++;
			System.out.println(x);
				if(++x<5)
					continue;//skips the value
				x++;
				System.out.println(x);
		
			} while(++x<10);
	}

}
