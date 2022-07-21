//Write a program to check if a given string is a Palindrome.
//A palindrome reads same from front and back e.g.- aba, ccaacc, mom, etc.

package com.globallogic.helloworld;

import java.util.Scanner;

public class StringPalin {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//String str= sc.nextLine();
		StringBuilder sb = new StringBuilder(sc.nextLine());
		StringBuilder rev= sb.reverse();
		System.out.println(rev);
		sc.close();
	}

}