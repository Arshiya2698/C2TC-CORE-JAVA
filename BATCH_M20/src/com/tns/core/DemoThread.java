//create a thread using thread class
package com.tns.core;
class ChildThread extends Thread
{
	public void run() {
		for (int i=0;i<10;i++)
		{
			System.out.println("child thread");//passes the chance of execution to the main thread
			Thread.yield();
		}
	}
}
//thread scheduler

public class DemoThread {

	public static void main(String[] args) {
		// 

ChildThread t=new ChildThread ();
t.start();

for (int i=0;i<10;i++)
{
	System.out.println("main thread");
}
	}

}
