package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("This is get method............");
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		out.println("<h1>This is get method example</h1>");
		
	}
	

}
