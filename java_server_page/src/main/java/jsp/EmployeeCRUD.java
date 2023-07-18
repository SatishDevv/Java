package jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=toor");
		return connection;
	}
	public int saveEmployee(Employee employee) throws Exception {
	
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setLong(3, employee.getPhone());
		preparedStatement.setString(4, employee.getAddress());
		preparedStatement.setString(5,employee.getEmail());
		preparedStatement.setString(6,employee.getPassword());
		
		int rows=preparedStatement.executeUpdate();
		connection.close();
	
		return rows;
	}
	
	
	public String getPassword(String email) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select password from employee where email=?");
		preparedStatement.setString(1, email);
		ResultSet resultSet=preparedStatement.executeQuery();
		String password=null;
		
		while(resultSet.next()) {
			password=resultSet.getString("password");
		}
		connection.close();
		return password;
		
	}
	
	public List<Employee> getAllEmployee() throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee");
		ResultSet resultSet=preparedStatement.executeQuery();
		List<Employee> list=new ArrayList<Employee>();
		while(resultSet.next()) {
			Employee employee=new Employee();
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("Name"));
			employee.setPhone(resultSet.getLong("phone"));
			employee.setAddress(resultSet.getString("address"));
			employee.setEmail(resultSet.getString("email"));
			employee.setPassword(resultSet.getString("password"));
			list.add(employee);
		}
		connection.close();
		return list;
		
	}
	public int deleteEmployee(int id) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where id=?");
		preparedStatement.setInt(1, id);
		int count=preparedStatement.executeUpdate();
		
		connection.close();
		return count;
		
	}
	public Employee getEmployee(int id) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee where id=?");
		preparedStatement.setInt(1, id);
		ResultSet resultSet=preparedStatement.executeQuery();
		Employee employee=new Employee();
		while(resultSet.next()) {
			employee.setId(resultSet.getInt("id"));
			employee.setName(resultSet.getString("Name"));
			employee.setPhone(resultSet.getLong("phone"));
			employee.setAddress(resultSet.getString("address"));
			employee.setEmail(resultSet.getString("email"));
			employee.setPassword(resultSet.getString("password"));
			
		}
		connection.close();
		return employee;
		
	}
	
	
	public int editEmployee(Employee employee) throws Exception {
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update employee set name=?,phone=?,address=?,email=?,password=? where id=?");
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setLong(2, employee.getPhone());
		preparedStatement.setString(3, employee.getAddress());
		preparedStatement.setString(4,employee.getEmail());
		preparedStatement.setString(5,employee.getPassword());
		preparedStatement.setInt(6, employee.getId());
		int rows=preparedStatement.executeUpdate();
		connection.close();
	
		return rows;
		
	}

}
