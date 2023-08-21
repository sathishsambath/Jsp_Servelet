package org.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userList")
public class UserListServlet extends HttpServlet {
	
	

	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	        List<String> userList = new ArrayList<>();
	        userList.add("Alice");
	        userList.add("Bob");
	        userList.add("Charlie");

	        // Set the content type to HTML
	        response.setContentType("text/html");

	        // Write the HTML response
	        response.getWriter().println("<html><body>");
	        response.getWriter().println("<h1>User List</h1>");
	        response.getWriter().println("<ul>");

	        for (String user : userList) {
	            response.getWriter().println("<li>" + user + "</li>");
	        }

	        response.getWriter().println("</ul>");
	        response.getWriter().println("</body></html>");
	    }
	}

	


