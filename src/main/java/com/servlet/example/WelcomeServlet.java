package com.servlet.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Piyush Soni
 *
 */
@WebServlet(urlPatterns = { "/hello" }, loadOnStartup = 1)
public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = -3462096228274971485L;

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("This is servlet app");
	}
}