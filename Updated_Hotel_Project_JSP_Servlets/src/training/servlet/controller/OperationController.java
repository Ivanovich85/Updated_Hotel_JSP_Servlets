package training.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public OperationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page.toLowerCase();
		switch (page) {
		case "adduser":
			addUserFormLoader(request, response);
			break;

		default:
			break;
		}
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = request.getParameter("form");
		operation = operation.toLowerCase();
		switch (operation) {
		case "adduseroperation":
			
			break;

		default:
			break;
		}
	}
	
	private void addUserFormLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Add Users");
		request.getRequestDispatcher("addUser.jsp").forward(request, response);
		
	}
}
