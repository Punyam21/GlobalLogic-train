package com.globallogic.helloworld;

class A11 {

	 final int a=20;
	
	public A11(int age) {
		//a=age;
		System.out.println("Age is class A " + age);
	}

	int id = 5;

	public void printA() {
		System.out.println("Print class A11");
	}
}

class B11 extends A11 {

	public B11(int age) {
		super(age);
		System.out.println(super.a);
		super.printA();
		System.out.println("Age class B11 "+age);
	
		// TODO Auto-generated constructor stub
	}

	public void printid() {
		int b;
		b = super.id + 5;
		System.out.println("Value of b " + b);
	}

	public void printB() {
		System.out.println("Print class B");
	}
}

public class example {
	public static void main(String[] args) {
		A11 a = new A11(10);
		a.printA();
		B11 b = new B11(20);
		b.printA();
		b.printB();
		b.printid();
		
		

	}

}