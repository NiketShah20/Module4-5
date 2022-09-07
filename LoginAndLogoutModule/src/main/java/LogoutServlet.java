import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		HttpSession session=req.getSession();
		String name=(String)session.getAttribute("user_name");
		session.invalidate();
		PrintWriter out=res.getWriter();
		if(name!=null) {
		
		out.println("<h1 style='color:black'>Logout successfull :) "+name+"</h1>");
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			out.println("<p style='color:red;'>*not login,login first</p><br>");
		}
	}

}
