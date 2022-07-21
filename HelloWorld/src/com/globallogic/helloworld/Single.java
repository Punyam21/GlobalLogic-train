package com.globallogic.helloworld;

 class A{
	public void printA(){
		System.out.println("Class A");
	}
}
 class B extends A{
	 public void printB(){
		 System.out.println("Class B");
	 }
 }
public class Single {
	public static void main(String[] args) {
		A a= new A();
		a.printA();
		B b=new B();
		b.printB();
		b.printA();
			
		
	}

}
