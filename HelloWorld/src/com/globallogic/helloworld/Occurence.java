//Write a program to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".

package com.globallogic.helloworld;

import java.util.*;

public class Occurence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String S");
	String s=sc.nextLine();
	System.out.println("Enter String S1");
	char s1= sc.next().charAt(0);
	
	System.out.println(s.indexOf(s1));
	
	System.out.println(s.lastIndexOf(s1));
}
}
