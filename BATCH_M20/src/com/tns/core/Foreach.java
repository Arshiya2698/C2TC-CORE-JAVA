package com.tns.core;
//for each loop
public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int[] []x= {{10,20,30,40},{50,60}};
		for (int[] x1:x)
		{
			for (int x2: x1)
			System.out.println(x2);
		}
	}

}
}