package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// 1. 드라이버 로드 : Class.forName("클래스의 풀네임");
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			

			// 2. Connection 객체를 생성 : 연결 정보
			// jdbcUrl
			// Oracle 연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
			
			// 트렌젝션 설정
			conn.setAutoCommit(false);
			
			//Mysql 연결
			//String dbUrl = "jdbc:mysql://localhost:3306/project";
			//Connection conn = DriverManager.getConnection(dbUrl, "himedia", "as8744034!");
			
			// 3. Statement / PreparedStatement => sql 실행 요청 
			
			// delete Sql
			String sql = "delete from dept where deptno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 50);
			
			int result = pstmt.executeUpdate();
			
			// pk이므로 1보다 큰 값이 나올 수 없음 (pk는 중복불가)
			if(result==1) {
				System.out.println("데이터가 삭제되었습니다.");
			}
			
			// 완료 commit
			conn.commit();
			
		
			
		
	
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			// System.out.println("연결 실패");
			
			if(conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			}
			
			
			e.printStackTrace();
		} finally {
			
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}