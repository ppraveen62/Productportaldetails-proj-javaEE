package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class displayServlet
 */
public class displayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		product obj = (product) request.getAttribute("product");
		out.println("<h1>Product Details<h1>");
		out.print("<h3>Id: "+obj.getUid());
		out.print("<h3>Name: "+obj.getUname());
		out.print("<h3>Price: "+obj.getUprice());
		out.print("<h3>Seller: "+obj.getUsd());
		
		
	}

}
