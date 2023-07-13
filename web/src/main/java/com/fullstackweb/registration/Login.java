package com.fullstackweb.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			String user_email = req.getParameter("email");
			String password = req.getParameter("password");
			
			HttpSession httpSession = req.getSession();
			RequestDispatcher requestDispatcher = null;
			RegistrationServlet registrationServlet = new RegistrationServlet();
			JdbcConnection jdbcConnection = new JdbcConnection();
			try {
				Connection connection = jdbcConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM USER WHERE user_email=? AND user_password=?");
				preparedStatement.setString(1, user_email);
				preparedStatement.setString(2, password);
				ResultSet resultSet= preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					req.setAttribute("status", "");
					httpSession.setAttribute("name",resultSet.getString("user_name"));
					requestDispatcher = req.getRequestDispatcher("index.jsp"); 
				}
				else {
					
					req.setAttribute("status", "Sorry You Are Enter Wrong Email and Password");
					requestDispatcher = req.getRequestDispatcher("login.jsp");
				}
				requestDispatcher.forward(req, resp);
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}

	}
		
}
