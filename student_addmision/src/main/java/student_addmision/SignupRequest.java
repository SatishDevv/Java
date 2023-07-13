package student_addmision;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupRequest extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String f_name = req.getParameter("fname");
		String m_name = req.getParameter("mname");
		int age =Integer.parseInt(req.getParameter("age"));
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ServletContext setContext = getServletContext();
		String schoole = setContext.getInitParameter("schoole");
		String  otp =  req.getParameter("fees");
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setFname(f_name);
		student.setMname(m_name);
		student.setAge(age);
		student.setPhone(phone);
		student.setEmail(email);
		student.setPassword(password);
		student.setSchoole(schoole);
		
		if (otp.equals("onetimepay")) {
				ServletConfig config = getServletConfig();
				long fee =  Long.parseLong(config.getInitParameter("onetimepay"));
				student.setFee(fee);
		} else {
			ServletConfig config = getServletConfig();
			long fee =  Long.parseLong(config.getInitParameter("install"));
			student.setFee(fee);
		}
		
		SignUpJdbc signUpJdbc = new SignUpJdbc(); 
		try {
			int count = signUpJdbc.insertStudent(student);
			if (count!=0) {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("");
				requestDispatcher.forward(req, resp);
			} else {
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}
