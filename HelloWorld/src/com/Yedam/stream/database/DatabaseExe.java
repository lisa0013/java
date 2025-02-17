package com.Yedam.stream.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExe {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 오라클DB의 이름.
		String user = "hr";
		String password = "hr";
		try {
			Connection conn = //
					DriverManager.getConnection(url, user, password);
			System.out.println("연결성공");
			// tbl_student 테이블의 조회.
			Statement stmt = conn.createStatement();
			
			// 추가(insert)
			// stmt.executeUpdate("insert into tbl_student (student_no, student_name) values('S007','박현수')");
			
			// 수정(update)
			// 박현수의 연락처 010-8787-6565
			// stmt.executeUpdate("update tbl_student set phone = '010-8787-6565' where student_name ='박현수'"); 
			String query = "delete from tbl-student "//
					+ "where student_name = '박현수'";
			int r = stmt.executeUpdate(query);
			if (r > 0) {
				System.out.println("수정완료");
			}
					
			// 조회쿼리(select)
			ResultSet rs = stmt.executeQuery("select * from tbl_student"); 
			
			// 반복문활용.
			while(rs.next()) { // 조회결과 true, 마지막데이터 false.
				// 컬럼명.
				System.out.println(rs.getString("student_no")//
						+"  "+rs.getString("student_name")//
						+"  "+rs.getString("phone")//
						+"  "+rs.getString("address")//
						);
			}
			System.out.println("end of data");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}
}
