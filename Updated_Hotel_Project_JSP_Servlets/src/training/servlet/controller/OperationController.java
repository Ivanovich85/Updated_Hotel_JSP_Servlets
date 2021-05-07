package training.servlet.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import training.entity.Address;
import training.entity.Hotel;
import training.entity.User;
import training.model.UserModel;


@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/Updated_Hotel")
    private DataSource dataSource;
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page = page.toLowerCase();
		switch(page) {
		case "listhotels":
			System.out.println("from inside the doGet method case listHotels");
			listHotels(request, response);
			break;
		
		default:
//			errorPage(request, response);
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
							Integer.parseInt(request.getParameter("zipCode")), is_international);
			User newUser = new User(request.getParameter("username"), request.getParameter("email"), request.getParameter("name"), address);
			addUserOperation(newUser);
			request.setAttribute("title", "Home");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			break;
//		case "listHotels":
//			listHotels(request, response);
//			break;
		default:
			break;
		}
	}
	
	//Operation methods
	private void listHotels(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Hotel> listHotels = new ArrayList<>();
		listHotels = new UserModel().listHotels(dataSource);
		System.out.println("created list of hotels");
		request.setAttribute("listHotels", listHotels);
		request.setAttribute("title", "List of Hotels");
		request.getRequestDispatcher("listHotels.jsp").forward(request, response);
		
	}
	
	private void addUserOperation(User newUser) {
		new UserModel().addUser(dataSource, newUser);
		return;
	}
	
}
