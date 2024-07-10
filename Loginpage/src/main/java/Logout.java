//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//
//@WebServlet("/Logout")
//public class Logout extends HttpServlet {
//	private static final long serialVersionUID=1L;
//	
//	protected void doGet(HttpServletRequest req, HttpServletResponse res)
//	{
//		HttpSession hs=req.getSession();
//		hs.getAttribute("uname");
//		hs.invalidate();
//	}
//}
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID=1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		PrintWriter out = res.getWriter(); 
//		
		
		RequestDispatcher rd1=req.getRequestDispatcher("generalpage.html");
		
		
		rd1.include(req, res);
		
			
		HttpSession hs=req.getSession();
		hs.getAttribute("name");
		hs.invalidate();
		out.print("logged out successfully");
		out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<body>");
        
        
        out.println("</body>");
        out.println("<style>");
        out.println("body{text-align: center; color: white;}");
       
        out.println("</style>");
        out.println("</head>");
        
        out.println("</html>");
		
	}
}