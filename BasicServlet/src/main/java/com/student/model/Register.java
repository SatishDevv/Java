package com.student.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.StoreDataInJDBC;

@WebServlet("/StudentLogin")
public class Register extends HttpServlet {

		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			int id =Integer.parseInt(req.getParameter("id"));
			String name = req.getParameter("name");
			String mname = req.getParameter("middlename");
			String lname = req.getParameter("lastname");
			long phone = Long.parseLong(req.getParameter("phone"));
			int passout = Integer.parseInt(req.getParameter("passoutyear"));
			String date = req.getParameter("bdate");
			int marks = Integer.parseInt(req.getParameter("marks"));
			
			
			Student student = new Student();
			student.setStudent_id(id);
			student.setStudent_name(name);
			student.setStudent_middle_name(mname);
			student.setStudent_last_name(lname);
			student.setStudent_phone(phone);
			student.setStudent_passout_year(passout);
			student.setStudent_bday(date);
			student.setStudent_passout_year(marks);
			
			StoreDataInJDBC storeDataInJDBC = new StoreDataInJDBC();
			try {
				storeDataInJDBC.insertStudent(student);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	
	

}
