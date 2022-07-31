package tns.core.assignment;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number , orgnumber, remainder, res = 0;

	        
	        Scanner sc=new Scanner(System.in);         
	        System.out.print("Enter the number: ");  
	        number=sc.nextInt();
	        orgnumber = number;
	        while (orgnumber != 0)
	        {
	            remainder = orgnumber % 10;
	            res += Math.pow(remainder, 3);
	            orgnumber /= 10;
	        }

	        if(res == number)
	            System.out.println(number + " is an armstrong number.");
	        else
	            System.out.println(number + " is not an armstrong number.");

	}

}
