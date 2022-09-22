package com.globallogic.springcore;




	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class EmployeDI{

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ApplicationContext context = new ClassPathXmlApplicationContext("data.xml");
			
			//Constructor Injection
			System.err.println("CONSTRUCTOR INJECTION");
			Employe emp = (Employe) context.getBean("employeeDemo");
			System.err.println(emp);
			System.err.println();
			
			//Bean Injection
			System.err.println("BEAN INJECTION");
			Employe emp1 = (Employe)context.getBean("beanDemo");
			System.err.println(emp1);
			System.err.println();
			
			//Constructor Collection Injection
			System.err.println("CONSTRUCTOR COLLECTION INJECTION");
			Employe emp2 = (Employe)context.getBean("employeeCollectionDemo");
			System.err.println(emp2);
			System.err.println();
			//Bean Collection Injection
			System.err.println("BEAN COLLECTION INJECTION");
			Employe emp3 = (Employe)context.getBean("beanCollectionDemo");
			System.err.println(emp3);
			System.err.println();
			((ClassPathXmlApplicationContext) context).close();
		}

	
	}