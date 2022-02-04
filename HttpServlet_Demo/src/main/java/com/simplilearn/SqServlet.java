package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends AddServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		
		int k = (int) req.getAttribute("k");
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int p=i*j;
		int sq = k*k;
		PrintWriter out = res.getWriter();
		out.println("square is "+sq);
		out.println("product is "+p);
		out.println("sum is "+k);
	}

}
