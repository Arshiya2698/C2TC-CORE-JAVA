package tns.core.assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number , reverse = 0; 
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number: ");
	number=sc.nextInt();
	 
	//we have not mentioned the initialization part of the for loop  
	for( ;number != 0; number=number/10)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  

}
}
