package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class loginpage extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
		{
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
			String fn = request.getParameter("firstName");
			String ln = request.getParameter("lastName");
			String uname=request.getParameter("username");
			String pass=request.getParameter("password");
        	String add = request.getParameter("address");
			String cont = request.getParameter("contact");
			
			if(pass.equals("123"))
			{
				RequestDispatcher rd=request.getRequestDispatcher("answerpage") ;
				rd.forward(request, response);
			}
			
			else 
			{
				out.print("User credential is incorrect ");
				RequestDispatcher rd=request.getRequestDispatcher("login.html") ;
				rd.include(request, response);
				
			}

		}
}


