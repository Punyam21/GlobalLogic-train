package com.globallogic.helloworld;

import java.util.Scanner;

public class Stringex {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

		System.out.println("enter String 1");
		String s1=sc.next();
		System.out.println("enter String 2");
		String s2=sc.next();
	String s3="";
	
//	if((s1.indexOf(s2)==0)||(s1.lastIndexOf(s2)+s2.length()==s1.length()))
//	{
//		System.out.println(s1.charAt(s1.indexOf(s2)+s2.length()));
//		System.out.println(s1.charAt(s1.lastIndexOf(s2)-1));
//		s3=s3+(s1.charAt(s1.indexOf(s2)+s2.length()))+(s1.charAt(s1.lastIndexOf(s2)-1));
//	}
//	else{
//		
//		s3=s3+(s1.charAt(s1.indexOf(s2))-1)+(s1.charAt(s1.indexOf(s2)+s2.length()))+(s1.charAt(s1.lastIndexOf(s2)-1))+(s1.charAt(s1.indexOf(s2)));
//	}
	String[] s= s1.split(s2);
	System.out.println(s.length);
	for(int i=0;i<s.length-1;i++){
		
		char c=s[i].charAt(s[i].length()-1);
		char ch=s[i+1].charAt(0);
		s3=s3+(c)+(ch);
	
	}
	System.out.println(s3);
	}
	}
