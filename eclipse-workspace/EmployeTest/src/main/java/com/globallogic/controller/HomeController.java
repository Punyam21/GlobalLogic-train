package com.globallogic.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		if(name.equalsIgnoreCase("Punyam")&&pass.equalsIgnoreCase("pass")) {
		RequestDispatcher rd=request.getRequestDispatcher("/HomeController.jsp");
		rd.forward(request, response);}
		else {
			System.out.println("Invalid");
		}
	
	}

}
