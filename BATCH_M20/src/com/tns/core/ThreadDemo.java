package com.tns.core;

import java.util.Scanner;



//creating thread using runnable interface
//only one method is used
class Mythread implements Runnable{
public void run() {
	for (int i=0;i<5;i++)
		System.out.println(i);
}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t =new Mythread();
		Thread s=new Thread(t);    //constructor is used when thread is created using implement keyword
		s.start();
		
	}

}
