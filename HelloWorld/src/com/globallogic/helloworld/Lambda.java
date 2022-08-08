//Create a lambda to find the even and odd value
//create a lambda to find the lagrst number
//create a lambda to find the min  number
//create a lambda to print the hello world
//create a lambda to print the sum of 1 to 10 0 number


package com.globallogic.helloworld;
@FunctionalInterface
interface EvenOdd{
	public String res(int n);
}
@FunctionalInterface
interface LargestNum{
	public void res(int a,int b);
}
@FunctionalInterface
interface SmallestNum{
	public void res(int a,int b);
}
@FunctionalInterface
interface Print{
	public void print();
}
@FunctionalInterface
interface Sum{
	public int sum();
}

public class Lambda {



	public static void main(String[] args) {

		// Create a lambda to find the even and odd value

		System.out.println("**Ques 1*");

		 EvenOdd e= (n) -> (n%2==0)?"Even":"Odd";
		

			System.out.println(e.res(665587));
		
		

		System.out.println(e.res(55764356));

		System.out.println("**Ques 2*");

		// create a lambda to find the lagrst number

		LargestNum ln = (a, b) -> {
			if (a > b) 
				System.out.println(a + " is the larger no");
			 else 
				System.out.println(b + " is the larger no");
		};
		ln.res(3, 6);

		System.out.println();

		System.out.println("**Ques 3*");

		// create a lambda to find the min number

		SmallestNum sn = (a, b) -> {

			if (a > b) 
				System.out.println(b + " is the smaller no");
			else 
				System.out.println(a + " is the smaller no");
			
		};
		sn.res(3, 6);

		System.out.println();

		System.out.println("**Ques 4*");

		// create a lambda to print the hello world

		Print p1=()-> System.out.println("Hello World");
		
		p1.print();

		System.out.println();

		System.out.println("**Ques 5*");

		// create a lambda to print the sum of 1 to 10 0 number

		Sum stt = () -> {
			int sum = 0;
			for(int i=1;i<=10;i++) 
				sum = sum + i;
			return sum;
		};
		System.out.println(stt.sum());

	}

}