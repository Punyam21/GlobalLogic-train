

// To print color code using if else ladder

package com.globallogic.helloworld;
import java.util.*;
public class colorif {


  public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter color code");
	int code=sc.nextInt();
	if(code==1)
		System.out.println("red");
		
	else if(code==2)
		System.out.println("green");
	else if(code==3)
		System.out.println("orange");
	else if(code==4)
		System.out.println("yellow");
	else if(code==5)
		System.out.println("blue");
	else
		System.out.println("there are more colours");
	
	
	
	}
}

