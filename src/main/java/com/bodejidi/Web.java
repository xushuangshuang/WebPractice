package com.bodejidi;

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
		resp.getWriter().println("接受");
	}
}
