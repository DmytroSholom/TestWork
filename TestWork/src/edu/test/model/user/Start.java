package edu.test.model.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Start")
public class Start extends HttpServlet{

	/**
	 * @param args
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentEntity s = new StudentEntity();
		s.setLname("Sholom");
		s.setFname("Dmytro");
		s.setStartDate("1993");
		s.setEndDate("1996");
		s.setPassword("123");
		StudentManager.addNew(s);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("done");
	}

}
