package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Registration extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		String Condition=req.getParameter("conditon");
		PrintWriter out=res.getWriter();
		if(Condition!=null) {
			RequestDispatcher rd=req.getRequestDispatcher("Welcome.html");
			rd.forward 	(req, res);
		}
		else {
		
			RequestDispatcher rd=req.getRequestDispatcher("signup.html");
			rd.include(req, res);
			out.println("<p>*please accept terms and condition</p>");
		}
	}
}


