package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h1>Welcome to Register servlet</h1>");
		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String courses = req.getParameter("user_courses");
		String cond = req.getParameter("condition");
		if (cond!=null) {
			out.println("<h2>Nmae:"+name+"</h3>");
			out.println("<h3>Password:"+password+"</h3>");
			out.println("<h3>Email id:"+email+"</h3>");
			out.println("<h3>Course:"+courses+"</h3>");
			out.println("<h3>gender:"+gender+"</h3>");
		}
		else {
			out.println("You did not accept terms and conditions");
			//Adding request dispature
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}
	

}
