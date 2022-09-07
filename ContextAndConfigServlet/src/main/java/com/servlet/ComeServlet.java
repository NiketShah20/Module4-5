package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ComeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		Enumeration<String> GetConfig=config.getInitParameterNames();
		Enumeration<String>	GetContext=context.getInitParameterNames();
		PrintWriter out=res.getWriter();
		out.println("<h1>Config param:</h1><br>");
		while(GetConfig.hasMoreElements()) {
			String s1=GetConfig.nextElement();
			out.println(s1+": ");
			out.println(config.getInitParameter(s1)+"<br>");
		}
		out.println("<h1>Context param:</h1><br>");
		while(GetContext.hasMoreElements()) {
			String s1=GetContext.nextElement();
			out.println(s1+": ");
			out.println(context.getInitParameter(s1)+"<br>");
		}
	}

}
