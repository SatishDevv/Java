package com.fullstackweb.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/feedback")
public class feedBack extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null ;
		
		String name = req.getParameter("fullName");
		String email =req.getParameter("email");
		String phone =req.getParameter("phoneno");
		String message = req.getParameter("message");
		RequestDispatcher requestDispatcher = null;
		
		JdbcConnection jdbcConnection = new JdbcConnection();
		
		try {
			connection = jdbcConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into feed_back values(?,?,?,?)");
			preparedStatement.setString(1,name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, phone);
			preparedStatement.setString(4, message);
			int count = preparedStatement.executeUpdate();
			if(count!=0) {
				
				
//				requestDispatcher = req.getRequestDispatcher("index.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
