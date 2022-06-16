package com.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.services.UsuarioService;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.getRequestDispatcher("views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("usuario");
		String pass = request.getParameter("senha");
		
		UsuarioService uService = new UsuarioService();
		if (uService.Login(email, pass)) {
			response.sendRedirect(request.getRequestURI().replace("login", "home"));
		} else {
			request.getRequestDispatcher("views/login.jsp").forward(request, response);
		}
		
		
	}

}
