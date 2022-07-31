package tns.core.assignment;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int i = 1, Number, Sum = 0 ;
		Scanner	sc = new Scanner(System.in);		
			System.out.println("Please Enter any Number: ");
			Number = sc.nextInt();

			while(i < Number) {
				if(Number % i == 0)  {
					Sum = Sum + i;
				}
				i++;
			}
			if (Sum == Number) {
				System.out.format(Number+ " is a Perfect Number");
			}
			else {
				System.out.format("%d is NOT a Perfect Number", Number);
			}
	}

}
