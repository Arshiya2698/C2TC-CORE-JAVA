package com.tns.core;
class Adarsh extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Adarsh thread");
		
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			
		}
	}}
}

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Adarsh a= new Adarsh();
a.start();
a.join(3000,100);//amol wants to wait
	
	
	for(int i=0;i<10;i++)
	{
		System.out.println("amol thread");
	}

}
}