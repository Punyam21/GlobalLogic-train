package com.globallogic.helloworld;

import java.util.Iterator;
import java.util.*;
public class Iterate {
	public static void main(String[] args) {
		
	
	ArrayList<String> ls = new ArrayList<String>();
	// add method is use to add the value to list
	ls.add("ravinder");
	ls.add("kumar");
	ls.add("ajay");
	ls.add("zee");
	Collections.sort(ls);
	Iterator<String > it=  ls.iterator();
	//it will check there is any next element is there or not
	//it will return true if there is any element
	//it will return false if there is not element
	
	


//	
	while(it.hasNext())
	{
		//String element=it.next();
		System.out.println("element is "+it.next());
}
}}
