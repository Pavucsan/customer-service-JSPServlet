package com.poc;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
//		
//		int total = num1 + num2;
//		System.out.println("Total: " + total);
//		
//		PrintWriter out = res.getWriter();
//		out.println(total);
//	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int total = num1 + num2;
		System.out.println("doGet Total: " + total);
		
		PrintWriter out = resp.getWriter();
		out.println(total);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int total = num1 + num2;
		System.out.println("doPost Total: " + total);
		
//		*********Session Management**********
//		one servlet to another servlet
		/*
		req.setAttribute("K", num1);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, resp);
		*/
		
//		send redirect
//		resp.sendRedirect("sq?k="+num1); //URL Rewriting

//		PrintWriter out = resp.getWriter();
//		out.println(total);
		
//		HttpSession
//		HttpSession session = req.getSession();
//		session.setAttribute("k", num1);
//		resp.sendRedirect("sq");
//		
		//Cookies
		Cookie cookie = new Cookie("k", num1+""); //"" convert num to string
		resp.addCookie(cookie);
		
		resp.sendRedirect("sq");
		
	}
	
	

}
