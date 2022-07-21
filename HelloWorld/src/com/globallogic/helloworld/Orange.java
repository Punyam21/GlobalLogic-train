
//Write a program to check if the word 'orange' is present in the "This is orange juice".
package com.globallogic.helloworld;
import java.util.*;
public class Orange {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String S");
	String s=sc.nextLine();
	System.out.println("Enter String S1");
	String s1=sc.nextLine();
	
	System.out.println(s.contains(s1));
}
}
