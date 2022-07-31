package tns.core.assignment;

import java.util.Scanner;

public class palindomeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String original, reverse = ""; 
	      Scanner sc = new Scanner(System.in);   
	      System.out.println("Enter a string");  
	      original = sc.nextLine();   
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println(original +" string is a palindrome.");  //madam
	      else  
	         System.out.println(original +" string is not a palindrome.");   
	   }  
	}


