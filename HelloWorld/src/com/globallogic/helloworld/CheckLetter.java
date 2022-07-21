
//Write a program to check if the letter 'e' is present in the word 'Umbrella'.
package com.globallogic.helloworld;

public class CheckLetter {
	public static void main(String[] args) {
		String str="Umbrella";
		if(str.contains("e"))
		{
			System.out.println("E is present in the string");
		}
		else
		{
			System.out.println("E is not present in the string");
		}
	}

}