


// To print Person is allowed to vote or not

package com.globallogic.helloworld;
import java.util.*;
public class Voting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	int age=sc.nextInt();
	if(age>18){
		System.out.println("Allowed to cast the vote");
	}
	else{
		System.out.println("Not Allowed to cast the vote");
	}
}
}
