import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String name=req.getParameter("user_name");
		String password=req.getParameter("user_password");
		PrintWriter out=res.getWriter();
		if((name.equals("Niket")|| name.equals("Akshay")|| name.equals("Baldev")) && (password.equals("shivalik"))) {
			HttpSession session=req.getSession();
			session.setAttribute("user_name",name);	
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			out.println("<p style='color:black;'>Login successfull.</p><br>");
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			out.println("<p style='color:red;'>*incorrect password</p><br>");
		}
	}

}
