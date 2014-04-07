package com.bodejidi;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Web extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
	{
			
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		 PrintWriter out = resp.getWriter();
		 resp.setContentType("text/html");
		 String firstName = req.getParameter("firstName");
		 String lastName = req.getParameter("lastName");
		 String username = req.getParameter("username");
		 String password = req.getParameter("password");
		 String repassword = req.getParameter("repassword");
		 String email = req.getParameter("email");
		 String phone = req.getParameter("phone");
		 String address = req.getParameter("address");

                 out.println("<html>");
                 out.println("  <head>");
                 out.println("    <title>Login Success</title>");
                 out.println("  </head>");
                 out.println("  <body>");
                 out.println("    <h1>Welcome Admin!</h1>");
                 out.println("  </body>");
                 out.println("</html>");
	}
}
