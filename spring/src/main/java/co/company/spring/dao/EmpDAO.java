package co.company.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component // bean등록
public class EmpDAO {
	@Autowired
	DataSource ds;

	Connection conn;
	PreparedStatement psmt;
	final String SELECT = "SELECT * FROM EMPLOYEES";
	final String INSERT = "INSERT INTO EMPLOYEES(EMPLOYEE_ID, LAST_NAME, EMAIL, "
			+ "HIRE_DATE, JOB_ID) VALUES(?,?,?,SYSDATE,'IT_PROG')";
	public void insert(Emp emp) {
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(INSERT);
			psmt.setString(1,  emp.getEmployeeId());
			psmt.setString(2,  emp.getLastName());
			psmt.setString(3,  emp.getEmail());
			psmt.executeUpdate(); 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public ArrayList<Emp> getList() {
		ArrayList<Emp> list = new ArrayList<Emp>();
		try {
			conn = ds.getConnection();
			psmt = conn.prepareStatement(SELECT);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmployeeId(rs.getString("employee_id"));
				list.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}
}
