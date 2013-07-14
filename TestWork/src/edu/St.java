package edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.test.model.user.StudentEntity;
import edu.test.model.user.StudentManager;

/**
 * Servlet implementation class St
 */
@WebServlet("/St")
public class St extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public St() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
