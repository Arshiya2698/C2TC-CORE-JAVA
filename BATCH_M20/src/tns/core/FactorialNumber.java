package tns.core.assignment;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i,fact=1;  
		  int number=5;//It is the number to calculate factorial   
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  number=sc.nextInt();
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
