package jsp;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Employee employee = new Employee();
		EmployeeCRUD crud=new EmployeeCRUD();
		try {
			String dbpassword=crud.getPassword(email);
			if(password.equals(dbpassword)) {
				EmployeeCRUD emoCrud = new EmployeeCRUD();
				Cookie cookie = new Cookie("name",employee.getName() );
					resp.addCookie(cookie);
				
				List<Employee> employees= crud.getAllEmployee();
				req.setAttribute("list", employees);
				RequestDispatcher dispatcher=req.getRequestDispatcher("success.jsp");
				dispatcher.forward(req, resp);
			}else {
				req.setAttribute("message", "invalid credentials");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
