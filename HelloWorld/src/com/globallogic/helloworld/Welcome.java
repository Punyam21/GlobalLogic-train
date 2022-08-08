package com.globallogic.helloworld;
import java.util.*;
public class Welcome {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ar1=new ArrayList<ArrayList<Integer>>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		ar1.add(arr);
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(10);
		ar2.add(20);
		ar2.add(30);
		ar1.add(ar2);
		System.out.println(ar1);
	}
}
