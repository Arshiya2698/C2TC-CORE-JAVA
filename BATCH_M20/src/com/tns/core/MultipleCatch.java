package com.tns.core;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a[]=new int[4];
	a[4]=3/0;
	
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("ArrayIndexOutOfBoundException occur");
}
catch(ArithmeticException e) {
	System.out.println("Arithmetic exception occur");
	
}
//catch(ArrayIndexOutOfBoundsException e) {
//	System.out.println("ArrayIndexOutOfBoundException occur");
//}
catch(Exception e) {
	System.out.println("Parent Exception occur");
}

		
		
	}

}
