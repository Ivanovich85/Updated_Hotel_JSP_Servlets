package training.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/site")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page = request.getParameter("page");
		page.toLowerCase();
		switch (page) {
		case "home":
			homePage(request, response);
			break;
		case "loadadduserpage":
			addUserPage(request, response);
			break;
		case "hotels":
			hotelsPage(request, response);
			break;
		default:
			errorPage(request, response);
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
//Site Controller methods
	private void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Home Page");
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}
	
	private void hotelsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "List of Hotels");
		request.getRequestDispatcher("listHotels.jsp").forward(request, response);
	}
	
	private void errorPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Error Page");
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}
	
	private void addUserPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Add Users");
		request.getRequestDispatcher("addUser.jsp").forward(request, response);
		
	}
}
