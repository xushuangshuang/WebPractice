package com.bodejidi;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Web extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponce resp)
	{
		resp.getWrite().println("接受");
	}
}
