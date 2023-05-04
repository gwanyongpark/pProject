package test.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import test.dao.TestDAO;
import test.domain.TestDTO;
import test.util.ConnectionProvider;

public class TestListService {
	
	TestDAO dao;

	private TestListService() {
		this.dao = TestDAO.getInstance();
	}
	
	private static TestListService service = new TestListService();
	
	public static TestListService getInstance() {
		return service;
	}
	
	public List<TestDTO> getList(){
		
		Connection conn = null;
		List<TestDTO> list = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			System.out.println("conn : " + conn);
			
			list = dao.selectByAll(conn);
			System.out.println(list);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return list;
	
	}
	

}
