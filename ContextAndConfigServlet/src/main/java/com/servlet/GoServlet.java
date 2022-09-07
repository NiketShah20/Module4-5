package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		ServletConfig config=getServletConfig();
		
		ServletContext context=getServletContext();
		Enumeration<String> Enumer=config.getInitParameterNames();
		Enumeration<String> Enumer2=context.getInitParameterNames();
		PrintWriter out=res.getWriter();
		out.println("<h1>Config para:</h1><br>");
		while(Enumer.hasMoreElements()) {
			String s1=Enumer.nextElement();
			out.println(s1+": ");
			out.println(config.getInitParameter(s1)+"<br>");
		}
		out.println("<h1>Context Para:</h1><br>");
		while(Enumer2.hasMoreElements()) {
			String s1=Enumer2.nextElement();
			out.println(s1+": ");
			out.println(context.getInitParameter(s1)+"<br>");
		}
	}
}
