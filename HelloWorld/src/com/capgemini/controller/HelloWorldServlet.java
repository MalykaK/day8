 package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public HelloWorldServlet() {
        super();
      System.out.println("Inside the default Constructor");
    }
@Override
public void init(ServletConfig config) throws ServletException {
	// TODO Auto-generated method stub
	System.out.println("init() method is called");
	//super.init(config);
}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoGet() method is called");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>Hello World</h>");
		out.close();
	}
public void destroy() {
	System.out.println("Destroy method is called");
}
}
