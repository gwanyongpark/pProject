package test.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.service.TestListService;
import test.domain.TestDTO;


@WebServlet("/List")
public class TestListController extends HttpServlet {
         
	TestListService listService;
	
    public TestListController() {
        this.listService = TestListService.getInstance();
    }

	protected void doGet(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		System.out.println("TestListController... doGet()...");
		
		List<TestDTO> list = listService.getList(); 
		
		request.setAttribute("TestList", list);
		
		String viewPath = "/WEB-INF/view/test/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
		dispatcher.forward(request, response);

	}

	
	

}
