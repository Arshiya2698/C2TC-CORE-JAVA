package com.tns.core;
////
public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
abstract class Vehicle{//partially implemented class
	abstract void noOfWheels();
	
}
class Scooty extends Vehicle{
	
	@Override
	void noOfWheels () {
		System.out.println(2);
	}
}