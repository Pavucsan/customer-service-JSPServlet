package com.poc;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.CookieStore;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqureServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// get from RequestDispatcher
//		int num1 = (int) req.getAttribute("K");

		HttpSession session = req.getSession();
		int num1 = (int) session.getAttribute("k");

		int squre = (int) Math.pow(num1, num1);
		System.out.println("RequestDispatche Squre: " + squre);
		PrintWriter out = resp.getWriter();

		out.println("Squre : " + squre);
//		session.removeAttribute("k");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGET");
//		int num1 = Integer.parseInt(req.getParameter("k"));

		// Session
//		HttpSession session = req.getSession();
//		int num1 = (int) session.getAttribute("k");
		
		// Cookies
		int num1 = 0;
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals("k"))
				num1 = Integer.parseInt(cookie.getValue());
		}

		int squre = (int) Math.pow(num1, num1);
		System.out.println("RequestDispatche Squre: " + squre);
		PrintWriter out = resp.getWriter();

		out.println("Squre : " + squre);
	}

}
