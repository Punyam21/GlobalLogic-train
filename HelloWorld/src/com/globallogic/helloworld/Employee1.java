package com.globallogic.helloworld;

public class Employee1 extends Person {
private String name;
private double salary;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Employee1(String nam, String name, double salary, int age) {
	super(nam);
	this.name = name;
	this.salary = salary;
	this.age = age;
}
public void print(){
	System.out.println("Person name"+super.getName());
	System.out.println("Employee name"+this.name);
	System.out.println("Employee salary"+this.salary);
	System.out.println("Employee age"+this.age);
	
}
}