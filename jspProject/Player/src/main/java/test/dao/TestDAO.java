package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.domain.TestDTO;
import test.domain.TestDTO;

public class TestDAO {
	
	private TestDAO() {	
	}
	
	private static TestDAO dao = new TestDAO();
	
	public static TestDAO getInstance() {
		return dao;
	}

	public List<TestDTO> selectByAll(Connection conn) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<TestDTO> list = null; 
		
		String sql = "select * from test;";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<TestDTO>();

			while(rs.next()) {
				list.add(makeTestDTO(rs));
			}
			
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
				
		return list;
	}
	
	private TestDTO makeTestDTO(ResultSet rs) throws SQLException {
		
		return new TestDTO(
				rs.getInt("pno"), 
				rs.getString("pname"), 
				rs.getString("duedate"), 
				rs.getBoolean("finished"));
	}
	
}
