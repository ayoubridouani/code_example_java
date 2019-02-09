package web;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Appreciation;

/**
 * Servlet implementation class UneServelet
 */

public class UneServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Appreciation contact;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UneServelet() {
        super();
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		contact = new Appreciation(request.getParameter("nom"),
							  request.getParameter("appreciation"),
							  new Date());
		
		request.setAttribute("contact", contact);
		request.getRequestDispatcher("affichage.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
