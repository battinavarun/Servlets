package com.servlet;

import java.util.*;	

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletInterfaceDemo implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		
		Date d = new Date();
		
		PrintWriter pw= res.getWriter();
		pw.print("<html>");
        pw.print("<head><title>Servlet Interface Demo</title>");
        pw.print("<style>");
        pw.print("body {");
        pw.print("    font-family: Arial, sans-serif;");
        pw.print("    background-color: #ffeb3b; /* Yellow background color */");
        pw.print("    color: #333;");
        pw.print("    text-align: center;");
        pw.print("    padding: 50px;");
        pw.print("    margin: 0;");
        pw.print("}");
        pw.print(".container {");
        pw.print("    max-width: 600px;");
        pw.print("    margin: 0 auto;");
        pw.print("}");
        pw.print("button {");
        pw.print("    outline: none;");
        pw.print("    cursor: pointer;");
        pw.print("    border: none;");
        pw.print("    padding: 0.9rem 2rem;");
        pw.print("    margin: 0;");
        pw.print("    font-family: inherit;");
        pw.print("    font-size: inherit;");
        pw.print("    position: relative;");
        pw.print("    display: inline-block;");
        pw.print("    letter-spacing: 0.05rem;");
        pw.print("    font-weight: 700;");
        pw.print("    font-size: 17px;");
        pw.print("    border-radius: 500px;");
        pw.print("    overflow: hidden;");
        pw.print("    background: #66ff66; /* Button background color */");
        pw.print("    color: ghostwhite;");
        pw.print("}");
        pw.print("button span {");
        pw.print("    position: relative;");
        pw.print("    z-index: 10;");
        pw.print("    transition: color 0.4s;");
        pw.print("}");
        pw.print("button:hover span {");
        pw.print("    color: black;");
        pw.print("}");
        pw.print("button::before,");
        pw.print("button::after {");
        pw.print("    position: absolute;");
        pw.print("    top: 0;");
        pw.print("    left: 0;");
        pw.print("    width: 100%;");
        pw.print("    height: 100%;");
        pw.print("    z-index: 0;");
        pw.print("}");
        pw.print("button::before {");
        pw.print("    content: \"\";");
        pw.print("    background: #000;");
        pw.print("    width: 120%;");
        pw.print("    left: -10%;");
        pw.print("    transform: skew(30deg);");
        pw.print("    transition: transform 0.4s cubic-bezier(0.3, 1, 0.8, 1);");
        pw.print("}");
        pw.print("button:hover::before {");
        pw.print("    transform: translate3d(100%, 0, 0);");
        pw.print("}");
        pw.print("</style>");
        pw.print("</head>");
        pw.print("<body>");
        pw.print("<div class=\"container\">");
        pw.print("<h1 class=\"mb-4\">Servlet Interface Demo</h1>");
        pw.print("<p>Current Time: " + d.toString() + "</p>");
        pw.print("<button onclick=\"window.location.href='index.html'\"><span>Back to Index</span></button><br/><br/>");
        pw.print("</div>");
        pw.print("</body>");
        pw.print("</html>");
	}

}
