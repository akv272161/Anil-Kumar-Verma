package com.simpliLearn.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;

public class FirstServlet implements Servlet {
	
	ServletConfig conf;



	@Override
	public ServletConfig getServletConfig() {
		
		return this.conf;
	}

	@Override
	public String getServletInfo() {
		
		return "this servlet is created by Anil Verma";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.conf = conf;
		System.out.println("creating object........");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servicing............");
		PrintWriter out = res.getWriter();
		out.println("Todays Data and time is:");
		
	}
	@Override
	public void destroy() {
		System.out.println("going destroyed servlet object.....");
		
	}
	

}
