package com.harshit.servlet.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class calculationServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		if(req.getParameter("n1")!= null && req.getParameter("n2")!= null && req.getParameter("n3")!= null) {
			Long n1 = Long.parseLong(req.getParameter("n1"));
			Long n2 = Long.parseLong(req.getParameter("n2"));
			Long n3 = Long.parseLong(req.getParameter("n3"));
			
			out.println("Addition: " + (n1+n2+n3));
			out.println("Subtraction: " + ((n1-n2)-n3));
			out.println("Multiplication: " + (n1*2*n3));
			}
		else {
			out.println("Please enter valid inputs");
		}

	}

}
