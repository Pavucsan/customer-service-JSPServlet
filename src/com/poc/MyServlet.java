//package com.poc;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
///**
// * ServletConfig & ServletContext
// * @author ASUS
// *
// */
//public class MyServlet extends HttpServlet{
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//		PrintWriter out = resp.getWriter();
//		out.print("Hi");
//		
//		ServletContext context = getServletContext();
//		String str = context.getInitParameter("name");
//		out.print(str);
//	}
//	
//
//}
