package com.globallogic.helloworld;
class man{
	private int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public man(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public void work()
{
		System.out.println("Working in GlobalLogic");
}
}
class teacher extends man{
	private int salary;
	private int empid;
	private String name;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
public teacher(int age, String nam,int salary, int empid, String name) {
		super(age,nam);
		this.salary = salary;
		this.empid = empid;
		this.name = name;
	}
public void work(){
	super.work();
	System.out.println("Person age"+super.getAge());
	System.out.println("Person name"+super.getName());
	System.out.println("Teacher name"+this.name);
	System.out.println("Teacher salary"+this.salary);
	System.out.println("Teacher age"+this.empid);
	
}
}
public class Poly {
public static void main(String[] args) {
	man ob=new teacher(23,"Agam",5000,23456,"AgamMishra");
	ob.work();
	System.out.println("  new   ");
	ob=new man(23,"Agam");
	ob.work();
}

}
