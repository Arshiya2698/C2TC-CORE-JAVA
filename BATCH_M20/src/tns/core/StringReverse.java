package tns.core.assignment;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a string: ");
		String str=sc.nextLine() ;
        String reversedStr = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i = str.length()-1; i >= 0; i--){    
            reversedStr = reversedStr + str.charAt(i);    
        }    
            
         
        System.out.println("Reverse of given string: " + reversedStr);  
	}

}
