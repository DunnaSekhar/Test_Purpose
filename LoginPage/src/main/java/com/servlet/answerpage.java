package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class answerpage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	 String fn = request.getParameter("firstName");
	 String ln = request.getParameter("lastName");
	 String un = request.getParameter("username");
	 String pw = request.getParameter("password");
	 String add = request.getParameter("address");
	 String cont = request.getParameter("contact");
	 out.println("First Name = " +fn);
	 out.println("Last Name = " +ln);
	 out.println("User Name = " +un);
	 out.println("password = " +pw);
	 out.println("Address = " +add);
	 out.println("Contact No = " +cont);

	}
}
