package com.globallogic.helloworld;

public class Stringmo {
	public static void main(String[] args) {
		String s="qwer*a*sdf*jkh";
		StringBuffer r=new StringBuffer(s);
		
		while(r.indexOf("*")!=-1)
		{
			
			int n= r.indexOf("*");
			r.replace(n-1, n+2, "");
			
		}
		System.out.println(r);
	}

}