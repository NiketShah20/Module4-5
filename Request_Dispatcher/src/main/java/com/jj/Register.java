package com.jj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Register extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		res.setContentType("text/html");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("user_course");
		String condition=req.getParameter("conditon");
		PrintWriter out=res.getWriter();
		if(condition!=null) {
			out.println("<br>Name:"+name);
			out.println("<br>Password:"+password);
			out.println("<br>Email:"+email);
			out.println("<br>Gender:"+gender);
			out.println("<br>Selected Course:"+course);
			RequestDispatcher rd1=req.getRequestDispatcher("Success");
			rd1.forward(req, res);
		}
		else {
			out.println("<p>*You have not accepted terms and conditions</p>");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
	
		
	}
	
}

