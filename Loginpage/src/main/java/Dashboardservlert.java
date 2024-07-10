//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//
//@WebServlet("/Dashboard")
//public class Dashboardservlert extends HttpServlet {
//	PrintWriter pw;
//	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
//	
//	
//	{
//		pw=res.getWriter();
//			RequestDispatcher rd1=req.getRequestDispatcher("general.html");
//		
//			rd1.include(req, res);
//		
//			
//			HttpSession sd=req.getSession();
//			if(sd!=null)
//			{
//				String name=(String)sd.getAttribute("username");
//				pw.print("welcome"+" "+name);
//			
//			}
//			else
//			{
//				pw.print("oops!");
//			}
//			
//			
//	}
//
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


@WebServlet("/Dashboard")
public class Dashboardservlert extends HttpServlet {
	PrintWriter pw;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	
	
	{
		pw=res.getWriter();
			RequestDispatcher rd1=req.getRequestDispatcher("generalpage.html");
		
			rd1.include(req, res);
		
			
			HttpSession sd=req.getSession(false);
			if(sd!=null)
			{
				String name=(String)sd.getAttribute("username");
				pw.print("welcome"+" "+name);
			
			}
			else
			{
				pw.print("oops! you have logged out....you have to login again");
			}
			
			
	}

}