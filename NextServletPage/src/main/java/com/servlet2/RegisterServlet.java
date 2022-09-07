package com.servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		String email=req.getParameter("user_email");
		String gender=req.getParameter("user_gender");
		String course=req.getParameter("select_course");
		PrintWriter out=res.getWriter();
		if(name!=null && password!=null && email!=null && gender!=null && course!=null) {
			out.println("<h1>Registration Details</h1><br><hr>");
			out.println("<p>Name:"+name+"</p>");
			out.println("<p>Password:"+password+"</p>");
			out.println("<p>Email:"+email+"</p>");
			out.println("<p>gender:"+gender+"</p>");
			out.println("<p>course:"+course+"</p>");
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("Registration.html");
			rd.include(req, res);
		}
	}

}
