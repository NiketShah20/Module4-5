package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingleServlet
 */
@WebServlet("/input")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String submit=request.getParameter("submit");
		switch(submit) {
		case "register":doRegister(request,response);
		break;
		case "edit": doEdit(request,response);
		break;
		case "update": doUpdate(request,response);
		break;
		}
		
	}
	protected void doRegister(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
	
		
	}
	protected void doEdit(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("Edit.jsp");
		rd.forward(request, response);
	}
	protected void doUpdate(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
		rd.include(request, response);
		PrintWriter out = response.getWriter();
		out.println("<p style='color:red'>*Update successfully saved.</p>");
	}
}