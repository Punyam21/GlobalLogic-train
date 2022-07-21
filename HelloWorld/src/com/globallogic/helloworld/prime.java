package com.globallogic.helloworld;

public class prime {
	
	public static void main(String[] args) {
	int n,i, j, f=0;
	for (i=10;i<=99;i++) {
		f=0;
	for (j=2;j<i/2;j++) {
	if (i%j==0) 
	f=1;
	}
	
	if(f== 0) 
	System.out.println(i);
	}
}}
