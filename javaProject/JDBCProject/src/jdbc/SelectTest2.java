package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {

	public static void main(String[] args) {
		
		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			

			// 2. Connection 객체를 생성 : 연결 정보
			// jdbcUrl
			// Oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// Mysql 연결
			// String dbUrl = "jdbc:mysql://localhost:3306/project";
			// Connection conn = DriverManager.getConnection(dbUrl, "himedia", "as8744034!");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 메소드
			
			// sql
			String sql = "select * from dept where deptno=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			// ? 파라미터 설정
			pstmt.setInt(1, 10);
			
			
		
			// 4. Select의 결과 데이터는 ResultSet 객체로 받는다.
			// select 실행 메소드 : executeQuery()
			ResultSet rs = pstmt.executeQuery(); // ()안에 sql X ~> 만들 때 이미 sql을 가지고 만들었기 때문에
			
			// 5. ResultSet 객체에서 데이터 추출
//			while(rs.next()) {
//				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
//			}
			
			// 예상하는 결과가 하나라면 if를 사용해 처리 가능
			if(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			} 
			
			rs.close();
			pstmt.close();
			conn.close();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패");
			e.printStackTrace();
		} 

	}

}
