package com.training.harshit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MultiplyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		if(req.getParameter("n1")!= null && req.getParameter("n2")!=null) {
		Long n1 = Long.parseLong(req.getParameter("n1"));
		Long n2 = Long.parseLong(req.getParameter("n2"));
	
		out.println("Result: "+ (n1*n2));
		}
		else {
			out.println("Enter valid input");
		}

	}

}
