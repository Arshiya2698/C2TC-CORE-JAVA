package com.tns.core;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ReentrantLock l=new ReentrantLock();//object l
l.lock();
System.out.println(l.isLocked());//true

System.out.println(l.isHeldByCurrentThread());//true

System.out.println(l.getHoldCount());//1

l.unlock();

System.out.println(l.isHeldByCurrentThread());//false

System.out.println(l.getHoldCount());//0

System.out.println(l.getQueueLength());//0
	}
	

}
