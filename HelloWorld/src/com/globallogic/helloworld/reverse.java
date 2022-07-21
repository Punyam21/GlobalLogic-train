
//Java Program to reverse the letters present in the given String


package com.globallogic.helloworld;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		
		
		String rev="";
		System.out.println("Enter the string you need to reverse");
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		int length = s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println("The reversed string is "+rev);
		sc.close();
	}

	}
