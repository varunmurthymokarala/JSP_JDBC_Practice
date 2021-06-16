package com.ilp.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ilp.beans.BloodBanks;
import com.ilp.service.BloodBanksService;

/**
 * Servlet implementation class BloodbankWriteServlet
 */
public class BloodbankWriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloodbankWriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		BloodBanks banks = new BloodBanks();
		//banks.setId(Integer.parseInt(request.getParameter("Id")));
		banks.setName(request.getParameter("bname"));
		banks.setGender(request.getParameter("gender"));
		banks.setNumber((Integer.parseInt(request.getParameter("contact"))));
		banks.setBloodgroup(request.getParameter("BloodGroup"));
		banks.setCity(request.getParameter("city"));
		
		String action = request.getParameter("formAction");
		
		BloodBanksService service = new BloodBanksService();
		if (action.equals("add")) {
			service.save(banks);
			session.setAttribute("message", "Blood Bank added!");
		} else if (action.equals("update")) {
			//banks.setId(Integer.parseInt(request.getParameter("Id")));
			//service.update(banks);
			//session.setAttribute("message", "Blood Bank updated!");
		} else {
			session.setAttribute("error", "Blood Bank "+action+" failed!"); 
			request.getRequestDispatcher("jsp/Error.jsp").forward(request, response);
		}
		
		
	}

}
