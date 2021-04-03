package eHotel.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RoomBookRentServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		int roomId = Integer.parseInt(req.getParameter("selectedAvailRoom"));
		String empFirstName = req.getParameter("empFirstName");
		String empLastName = req.getParameter("empLastName");
		
		if (roomId != -1) {
			req.setAttribute("roomId", roomId);
			req.setAttribute("empFirstName", empFirstName);
			req.setAttribute("empLastName", empLastName);
			
			req.getRequestDispatcher("create_booking_rental.jsp").forward(req, resp);
			return;	
		}
		resp.sendRedirect("login_failure.jsp");
		return;
	}
}
