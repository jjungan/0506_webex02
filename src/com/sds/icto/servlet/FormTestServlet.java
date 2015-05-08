package com.sds.icto.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormTestServlet
 */
@WebServlet("/param")
public class FormTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormTestServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String country = "";
		if(request.getParameter("country") != null){
			country = request.getParameter("country");
		}
		String[] hobby= {};
		if(request.getParameterValues("hobby") != null){
			hobby = request.getParameterValues("hobby");
		}
		String comment = "";
		if( request.getParameter("comment") != null){
			comment = request.getParameter("comment");
		}
		
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("<span>id : </span>"+id+"<br>");
		out.println("<span>pw : </span>"+pw+"<br>");
		out.println("<span>gender : </span>"+gender+"<br>");
		out.println("<span>country : </span>"+country+"<br>");
		out.println("<span>hobby : </span>");
		for (int i = 0; i < hobby.length; i++) {
			out.println(hobby[i]+" / ");
		}
		out.println("<br>");
		out.println("<span>comment : </span>"+comment);
		
		
		
	}

}
