/*Write a program to reverse individual words in a string, where each word may be delimited by
 *  a dot, comma, space or tab, like www.google.com should become www.elgoog.moc.*/

package com.globallogic.helloworld;

import java.util.Scanner;

public class delimeter {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String S");
	String s=sc.nextLine();
	String st=",.' 	";
    int i=0;
    
    String str="";
    for(int j=0;j<s.length();j++){
    	
    	if(st.contains(s.charAt(j)+"")==true){
    		
    
    		StringBuffer sb=new StringBuffer(s.substring(i,j));
    		
    		
    	
    		str+=((sb.reverse()).toString())+s.charAt(j);
    		i=j+1;
    	
    	}
    	
    	    }
	
    StringBuffer sb=new StringBuffer(s.substring(i));

	
	str+=sb.reverse();
	
	System.out.println(str);
	sc.close();
}
}