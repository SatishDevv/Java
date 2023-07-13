package jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		EmployeeCRUD crud=new EmployeeCRUD();
		try {
			Employee employee= crud.getEmployee(id);
			if(employee != null) {
				req.setAttribute("emp", employee);
				RequestDispatcher dispatcher=req.getRequestDispatcher("edit.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
