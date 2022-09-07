package com.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		PrintWriter out=res.getWriter();
		if(password.equals("Niket")) {
			RequestDispatcher rd=req.getRequestDispatcher("Welcome.html");
			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd2=req.getRequestDispatcher("login.html");
			rd2.include(req, res);
			out.println("<p>*incorrect username or password</p>");
		}
	}
	

}
