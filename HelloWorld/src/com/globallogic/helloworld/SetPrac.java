

//Create A set with all the implanatation with user defined class employee and perform the insert delete and searching and sorting
package com.globallogic.helloworld;

import java.util.*;
public class SetPrac {
public static void main(String[] args) {
	TreeSet<employe> my=new TreeSet<employe>(new ortby());
	Scanner sc = new Scanner(System.in);
	

				System.out.println("enter name");
				String s = sc.next();
				System.out.println("enter value");
				int v = sc.nextInt();
				System.out.println("enter salary");
				int sal = sc.nextInt();
				System.out.println("enter id");
				int id = sc.nextInt();
				my.add(new employe(s,v,sal,id));
				
				
				System.out.println("enter name");
				String s1 = sc.next();
				System.out.println("enter value");
				int v1 = sc.nextInt();
				System.out.println("enter salary");
				int sal1 = sc.nextInt();
				System.out.println("enter id");
				int id1 = sc.nextInt();
				my.add(new employe(s1,v1,sal1,id1));
				
				
				System.out.println("enter name");
				String s2 = sc.next();
				System.out.println("enter value");
				int v2 = sc.nextInt();
				System.out.println("enter salary");
				int sal2 = sc.nextInt();
				System.out.println("enter id");
				int id2 = sc.nextInt();
				my.add(new employe(s2,v2,sal2,id2));
				
				
				System.out.println("enter name");
				String s3 = sc.next();
				System.out.println("enter value");
				int v3 = sc.nextInt();
				System.out.println("enter salary");
				int sal3 = sc.nextInt();
				System.out.println("enter id");
				int id3 = sc.nextInt();
				my.add(new employe(s3,v3,sal3,id3));
				
				
				//System.out.println(my);
				//Collections.sort(my,new SortBy());
				//for(int j=0;j<pun.size();j++){
	
						//System.out.println(my);
					
				
				System.out.println("Enter the person name to be deleted");
				String na = sc.next();
				for (employe ea : my) {
					if (ea.getName().equalsIgnoreCase(na)) {

						my.remove(ea);
					}
					
				}

				System.out.println(my);
				//Collections.sort(my,new SortBy());
				//for(int j=0;j<pun.size();j++){
		
						
					
				
}
}

class ortby implements Comparator<employe>{
	@Override
	public int compare(employe o1, employe o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
class employe{
	private String name;
	private int value;
	private int salary;
	private int id;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public employe(String name, int value, int salary, int id) {
		super();
		this.name = name;
		this.value = value;
		this.salary = salary;
		this.id = id;
	}

	@Override
	public String toString() {
		return "employe [name=" + name + ", value=" + value + ", salary=" + salary + ", id=" + id + "]";
	}

	

}
