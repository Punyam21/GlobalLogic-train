
//Java program for swapping two numbers

package com.globallogic.helloworld;
import java.util.*;
public class Swap {
		
		public static void main(String[] args)
		{
			System.out.println("Enter the first number ");
			Scanner sc=new Scanner(System.in);
			int n1= sc.nextInt();
			System.out.println("Enter the second number ");
			
			int n2= sc.nextInt();
			int n3=0;
			n3=n1;
			n1=n2;
			n2=n3;
			System.out.println("The orignal number are "+n2+" "+n1);
			System.out.println("The reverse number is "+n1+" "+n2);
			sc.close();
		}

	}
