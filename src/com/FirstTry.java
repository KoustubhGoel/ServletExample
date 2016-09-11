package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstTry extends HttpServlet{

	private String message;
	  public void init() throws ServletException
	  {
	      // Do required initialization
	      message = "Hello World";
	  }
	  
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	// Set response content type
    resp.setContentType("text/html");

    // Actual logic goes here.
    PrintWriter out = resp.getWriter();
    out.write("<h1>" + message + "</h1>");

    String frm="<html>"
    		+ "<body>"
    		+ "<form>"
    		+ "name "
    		+ "<input type=text name=uname>"
    		+ "<button type =submit>submit</button>"
    		+ "</form>"
    		+ "</body>"
    		+ "</html>";
    out.write(frm);
    String username= req.getParameter("name");

out.close();
}


@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	

//	resp.setContentType("text/html;charset=UTF-8");
    PrintWriter out = resp.getWriter();
       
        String user=req.getParameter("uname");
        if(user.equals("qwerty")){System.out.println("correct");}
        
        out.write("<h2> Welcome "+user+"</h2>");
out.close();
}
	
}
