package com.globallogic.helloworld;

import java.util.*;

//key should not have null value
//list and set can hold one type of data 
//map can hold both
//key & value
//name & roll number
//name & number
//
class sortingby implements Comparator <my>{
	@Override
	public int compare(my o1, my o2) {
		
		// TODO Auto-generated method stub
		// 
		return o1.getName().compareTo(o2.getName());
	}
	
}
class my {
	String name;
	int value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public my(String name, int value) {
		super();
		this.name = name;
		this.value = value;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		my other = (my) obj;
		return Objects.equals(name, other.name) && value == other.value;
	}
	@Override
	public String toString() {
		return "my [name=" + name + ", value=" + value + "]";
	}
	
	
	
}
public class MyMap2 {
	public static void main(String[] args) {
		// hashtable- will not maintain the order & is thread safe
		// hashmap- is not thread safe
		//linkedhashmap- will maintain the order 
		// Treemap- store data in sorted manner
		TreeMap<my, Integer> map=new TreeMap<my, Integer>(new sortingby());
		map.put(new my("Rachel" , 30), 1);
		map.put(new my("Chandler" , 56), 3);
		map.put(new my("Ross" , 17), 2);
		map.put(new my("Joe" , 77), 6);
		map.put(new my("Monica" , 49), 5);
		map.put(new my("Phoebe" , 19), 4);
		//return true if contains key 
		//map.containsKey("Monica");
		//map.containsValue(11);
		//System.out.println(map);
		Set<my> keys= map.keySet();
		for(my key: keys) {
			System.out.println("keys "+ key+ " value "+ map.get(key));
		}
		
//		for(Map.Entry<my,Integer> entry: map.entrySet()) {
//			System.out.println("Key "+entry.getKey() +" value "+entry.getValue());
//		}
		//sorting by comparator
		// comparable to sort objects of similar types in one class
		//comparator to sort objects of different types in one/many class
		
		
		
	
	}
}