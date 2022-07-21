
//Write a program to find out the largest and smallest word in the string "This is an umbrella".
package com.globallogic.helloworld;

import java.util.Scanner;

public class largestandsmallest {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String S");
	String s=sc.nextLine();
	String str="";
	String small="";
    String[]a=s.split(" ");
    str=a[0];
    small=a[0];
    int max=a[0].length();
    int min=a[0].length();
    for(int i=1;i<a.length-1;i++){
    	if(max<a[i].length()){
    		max=a[i].length();
    		str=a[i];
    	}
    	if(min>a[i].length()){
    		min=a[i].length();
    		small=a[i];
    	}
    }
    System.out.println("largest   "+str+ "  Smallest   "+small);
    
}
}