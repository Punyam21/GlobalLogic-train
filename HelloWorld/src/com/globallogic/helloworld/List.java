//Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , sort the list and print

package com.globallogic.helloworld;

import java.util.*;

public class List {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();  
	list.add(100);
	list.add(523);
	list.add(100);
	list.add(99);
	list.add(98);
	list.add(97);
	for(int e:list){
		System.out.println(e);
	}
	list.remove(1);
	list.remove(4);
	list.set(1, 90);
	System.out.println("List values deleted ");
	for(int e:list){
		System.out.println(e);
	}
	
	System.out.println("Collection sorted ");
	Collections.sort(list);
	for(int e:list){
		System.out.println(e);
	}
}
}
