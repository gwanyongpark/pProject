package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Dept;

public class DeptDao {
	
	Connection conn;
	
	// 1. dept list : List<Dept>
	public List<Dept> selectByAll(Connection conn){
		
		// Connection 
		// 1. 메소드 내부에서 Connection을 구하는 방법
		//		(트랜젝션 사용 불가 -> X)
		// 2. Dao 클래스 내부의 인스턴스 변수로  Connection을 구하는 방법
		// 		(Dao 싱글톤 불가 ->  X, Connection 구하기 위해서 인스턴스를 게속 생성 - X)
		// 3. 매개변수로 Connection을 구하는 방법
		// 		-> Service 클래스의 메소드에서 Connection을 생성해서 전달
		
		// Close();
		
		// Connection
		// PreparedStatement
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 반환하고자하는 결과 데이터 
		// Collection 클래스 중 List => 입력 순서를 가진다. , index를 가진다. , 반복문
		List<Dept> result = new ArrayList<Dept>();
		
		// sql
		String sql = "select * from dept";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			// executeQuery
			// ResultSet
			rs = pstmt.executeQuery();
			
			// while
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				Dept dept = new Dept(deptno, dname, loc);
				// List<Dept>에 Dept 객체를 추가
				result.add(dept);
			}
			
			// result : 4개의 객체를 가지고 있다
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return result;
	}
	
	
	// 2. 부서 검색 (Connection conn, int num)
	public Dept selectByDeptno(Connection conn, int deptno) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept result = null;
		
		// sql
		String sql = "select * from dept where deptno = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				result = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			} 


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return result;

	}
	
	// 3. 부서 정보 입력 
	
	// 4. 부서 정보 수정 

	// 5. 부서 정보 삭제 
	
	
	
	
	public static void main(String[] args) throws SQLException {
		
		DeptDao dao = new DeptDao();
		
		String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dbUrl, "HR", "tiger");
		
		List<Dept> list = dao.selectByAll(conn);
		
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
		Dept dept = dao.selectByDeptno(conn, 10);
		System.out.println("결과 : " + dept);
		
	}
	

}
