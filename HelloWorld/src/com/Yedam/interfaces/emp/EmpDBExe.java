package com.Yedam.interfaces.emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * EmpDAO(인터페이스) 구현하는 클래스.
 */
public class EmpDBExe implements EmpDAO {

	Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클DB의 이름.
		String user = "hr";
		String password = "hr";
		Connection conn =null;
		try {
			conn = //
					DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public boolean registerEmp(Employee emp) { // 등록.
		String query = "insert into tbl_employees";
		query += "values ("+emp.getEmpNo() //
		+ ", " + emp.getEmpName() //
		+ ", " + emp.getTelNo() //
		+ ", " + emp.getHireDate() //
		+ ")";
		try {
			Statement stmt = getConnect().createStatement();
			int r = stmt.executeUpdate(query);
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	} // end of registerEmp().

	@Override
	public boolean modifyEmp(Employee emp) {
		String sql = "update tbl_employees\r\n"
				+ "set tel_no = nvl('654-0109', tel_no),\r\n"
				+ "    hire_date = case '' when '1900-01-01' then hire_date  \r\n"
				+ "                        else ''     \r\n"
				+ "                 end,-- to_date('20250109','yyyymmdd'),  -- 문자열 -> Date 변경.\r\n"
				+ "    salary = case '' when 0 then salary\r\n"
				+ "                     else ''\r\n"
				+ "            end\r\n"
				+ "where emp_no = 1003";
		return false;
	}

	@Override
	public boolean removeEmp(int empNo) {
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		List<Employee> empList = new ArrayList<>();
		String qry = "select * from tbl_employees" + "where emp_name = nvl('" + emp.getEmpName() + "', emp_name)" + "order by emp_no";
		try {
			Statement stmt = getConnect().createStatement();
			ResultSet rs = stmt.executeQuery(qry);
			
			// 조회결과.
			while(rs.next()) {
				Employee emp1 = new Employee();
				emp1.setEmpNo(rs.getInt("emp_no"));
				emp1.setEmpName(rs.getString("emp_name"));
				emp1.setHireDate(rs.getDate("hire_date"));
				emp1.setSalary(rs.getInt("salary"));
				emp1.setTelNo(rs.getString("tel_no"));
				
				empList.add(emp1);
			}
		} catch (SQLException e) {
					e.printStackTrace();
		}
		return empList;
	}

}
