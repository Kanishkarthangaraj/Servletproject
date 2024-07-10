//package com.view;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class method { 
//	public static boolean check(String name) {
//		try {
//			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dashboard","root","root");
//			String str="select * from loginpage where username=?;";
//			PreparedStatement ps=cn.prepareStatement(str);
//			ps.setString(1, name);
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
//				if(rs.getString(1).equals(name)) {
//					return true;
//				}
//			}
//			} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//		
//	}
//
//}
package method;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

public class method{
	
		public static boolean isvalid(String username, String password) {
			
			boolean check = false;
			try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dashboard","root","root");
				String str="select username,password from loginpage where username=? and password=?";
				PreparedStatement ps=con.prepareStatement(str);
				ps.setString(1, username);
				ps.setString(2, password);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					check=true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return check;
		}
		
}
