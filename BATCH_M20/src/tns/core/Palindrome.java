package tns.core.assignment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int r,sum=0,temp;    
		  int n;//It is the number variable to be checked for palindrome  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number:");//454
		  n=sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(sum+ " is a palindrome number ");    
		  else    
		   System.out.println(sum+ " is not a palindrome number");    
		}  
	}


