//
//
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
//import com.view.method;
//
///**
// * Servlet implementation class loginservlet
// */
//@WebServlet("/loginservlet")
//public class loginservlet extends HttpServlet {
//	public void doPost(HttpServletRequest req,HttpServletResponse res) {
//		String name=req.getParameter("id");
//		String pwd=req.getParameter("pwd");
//		boolean check=method.check(name);
//		if(check) {
//			HttpSession hsp=req.getSession();
//			hsp.setAttribute("username",name);
//			
//				PrintWriter pw = null;
//				try {
//					pw = res.getWriter();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				pw.print("yes");
//				RequestDispatcher rd=req.getRequestDispatcher("Dashboardservlet.java");
//				try {
//					rd.forward(req, res);
//				} catch (ServletException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			
//			RequestDispatcher rd=req.getRequestDispatcher("index1.html");
//			try {
//				rd.forward(req, res);
//			} catch (ServletException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
//		
//	
//	}

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import method.method;






@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
	    PrintWriter pw = res.getWriter(); 
		RequestDispatcher rd11=req.getRequestDispatcher("generalpage.html");
		
			rd11.include(req, res);

		String username=req.getParameter("username") ;
		String password=req.getParameter("password");	
		
		
	
		boolean check = method.isvalid(username,password);
		if(check)
		{
			
			HttpSession hs=req.getSession();
			hs.setAttribute("username",username);
			
				pw.print("Success");
			
			}
		else
		{
		
			    pw.print("oops some thing went wrong login again");
				RequestDispatcher rd1=req.getRequestDispatcher("index.html");
				rd1.forward(req, res);
			
		
			
		}
		
		
		
	}

	
}