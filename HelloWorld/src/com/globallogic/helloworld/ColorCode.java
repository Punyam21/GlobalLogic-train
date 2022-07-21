
// To print color code using switch case


package com.globallogic.helloworld;

import java.util.Scanner;

public class ColorCode {
  public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter color code");
	int code=sc.nextInt();
	switch(code){
	case 1:{
		System.out.println("red");
		break;}
	case 2 :{
		System.out.println("green");
		break;}
	case 3:{
		System.out.println("orange");
		break;}
	case 4:{
		System.out.println("yellow");
		break;}
	case 5 :{
		System.out.println("blue");
		break;}
	default:
	{
		System.out.println("there are more colours");
	}
	
	
	}
}
}
