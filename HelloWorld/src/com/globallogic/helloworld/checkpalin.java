package com.globallogic.helloworld;

import java.util.Scanner;

public class checkpalin {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String S");
	String s=sc.nextLine();
	String st="";
	String str="";
    String[]a=s.split(" ");
    for(int i=0;i<a.length;i++){
    	StringBuffer b=new StringBuffer(a[i]);
    
    	str=((b.reverse()).toString());
    
    	int j=a[i].compareTo(str);
    	if((j==0)&&(a[i].length()>1)){
    		st+=replace(a[i])+" ";
    	}
    	else
    	{
    		st+=a[i]+" ";
    	}
    }
    System.out.println(st);
}
public static String replace(String s){
	String n="";
	for(int i=0;i<s.length();i++){
		n=n+"*";
	}
	
	return n;
}
}
