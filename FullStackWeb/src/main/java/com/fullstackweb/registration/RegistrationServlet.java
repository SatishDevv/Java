package com.fullstackweb.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

	Connection connection =null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		JdbcConnection jdbcConnection = new JdbcConnection();
		
		String user_name = req.getParameter("name");
		String user_email = req.getParameter("email");
		String user_password = req.getParameter("pass");
		String user_phone_no = req.getParameter("contact");
		RequestDispatcher requestDispatcher = null;
		try {
			connection = jdbcConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user( user_name,user_email ,user_password,user_phone_no ) VALUES (?,?,?,?)");
			preparedStatement.setString(1, user_name);
			preparedStatement.setString(2, user_email);
			preparedStatement.setString(3, user_password);
			preparedStatement.setString(4, user_phone_no);
			int count = preparedStatement.executeUpdate();
			connection.close();
			if (count == 1) {
				req.setAttribute("status", "success");
				requestDispatcher = req.getRequestDispatcher("login.jsp");
			} 
			else if(count == -1) {
				req.setAttribute("status", "faild");
				requestDispatcher = req.getRequestDispatcher("registration.jsp");
			}
			requestDispatcher.forward(req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	
	}
	
	
}
