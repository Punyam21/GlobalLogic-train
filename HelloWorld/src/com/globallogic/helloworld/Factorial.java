//Java program to calculate a Factorial of a number

package com.globallogic.helloworld;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
	for(int i=1;i<=n;i++){
		if(n%i==0)
		System.out.println(i);
	}

}
}