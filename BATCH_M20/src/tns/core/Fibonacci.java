//program for fibonaccci series
package tns.core.assignment;

import java.util.Scanner;

public class Fibonacci {
	 public static void main(String[] args) {
 int firstterm=0,secondterm=1,n,i=1;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the number");
 n=sc.nextInt();
	System.out.println("fibnacci series for " + n+ "terms");
 while(i<=n) {
		System.out.println(firstterm);
	  int nextTerm = firstterm + secondterm;
      firstterm = secondterm;
      secondterm = nextTerm;

      i++;
 }
}
}