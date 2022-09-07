import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProfileServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		HttpSession session=req.getSession();
		res.setContentType("text/html");
		PrintWriter out =res.getWriter();
		String name=(String)session.getAttribute("user_name");
		if(name!=null) {
			out.println("<h1 style='color:black'>Welcome to profile "+name+"</h1>");
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			out.println("<p style='color:red;'>*not login,login first</p><br>");
			}
	}

}
