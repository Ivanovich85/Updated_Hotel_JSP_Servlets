package training.servlet.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import training.entity.Address;
import training.entity.User;
import training.model.UserModel;


@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/Updated_Hotel")
    private DataSource dataSource;
    
    public OperationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page.toLowerCase();
		switch (page) {
		case "loadadduserpage":
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
			boolean is_international;
			if(request.getParameter("is_international").equals("true")) {
				is_international= true;
			}else {is_international=false;}
			
			Address address = new Address(request.getParameter("street"), request.getParameter("city"), request.getParameter("state"), 
							Short.parseShort(request.getParameter("zipCode")), is_international);
			User newUser = new User(request.getParameter("username"), request.getParameter("email"), request.getParameter("name"), address);
			addUserOperation(newUser);
			break;

		default:
			break;
		}
	}
//Page loading methods
	private void addUserFormLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Add Users");
		request.getRequestDispatcher("addUser.jsp").forward(request, response);
		
	}
	
//Operation methods
	private void addUserOperation(User newUser) {
		new UserModel().addUser(dataSource, newUser);
		return;
	}


	
}
