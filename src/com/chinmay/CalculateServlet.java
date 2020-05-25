package com.chinmay;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int val1 = Integer.parseInt(req.getParameter("num1"));
		int val2 = Integer.parseInt(req.getParameter("num2"));
		
		char c = req.getParameter("op").charAt(0);
		PrintWriter out = res.getWriter();
		
		int ans = 0;
		switch(c) {
		case '+':
			ans = val1 + val2;
			break;
		case '-':
			ans = val1 - val2;
			break;
		case '*':
			ans = val1 * val2;
			break;
		case '/':
			ans = val1 / val2;
			break;
		default:		
			out.println("Invalid operation");
			return;
		}
		out.println("Answer is " + ans);
	}
}
