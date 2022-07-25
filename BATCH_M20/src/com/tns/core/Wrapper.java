package com.tns.core;

import java.util.ArrayList;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList l=new ArrayList();
Integer i=new Integer(10);
l.add(i);
System.out.println(l);
Float f=new Float(6.7f);
System.out.println(f);
Boolean b=new Boolean("NO");
Boolean c=new Boolean("YES");
System.out.println(b);
System.out.println(b.equals(c));


	}

}
