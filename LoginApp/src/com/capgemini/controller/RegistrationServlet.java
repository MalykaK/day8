package com.capgemini.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private HashMap<String,String> users=new HashMap<>();
       private ServletContext context;
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init(ServletConfig config) throws ServletException{
	context=config.getServletContext();
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
	
		if(users.containsKey(username)) {
			out.println("<h3>Username already exit and please enter another username</h3>");
			out.println("<a href='registration.html'>Try again</a>");
		}
		else {
			users.put(username, password);
			context.setAttribute("usersData", users);
			out.println("<h3>Registration Successful.</h3>");
			out.println("<br><br><a href='Login.html'>Login Here</a>");
			
			
		}
		out.close();
	}
	}


