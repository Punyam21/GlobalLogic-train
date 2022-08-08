package com.globallogic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.globallogic.emp.emplo;
import com.mysql.cj.Query;


public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Going to Add employee details page");

int id = Integer.parseInt(request.getParameter("eid"));

String name =  request.getParameter("name");
String address =  request.getParameter("add");
String phone =  request.getParameter("phone");
int age = Integer.parseInt( request.getParameter("age"));
int salary = Integer.parseInt(request.getParameter("sal"));



System.out.println("Userid : "+id);

System.out.println("Name : "+name);
System.out.println("Address : "+address);

System.out.println("Age : "+age);
System.out.println("Salary : "+salary);




emplo e  = new emplo(id,age,salary,name,address);
Query q = new Query();
q.addDetails(e);

List<Employee> employees = new Myquery().selectAllEmployee();
System.out.println(employees);

request.setAttribute("listemployee", employees);
RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");

dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



