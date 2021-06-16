package com.ilp.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ilp.beans.BloodBanks;
import com.ilp.service.BloodBanksService;

/**
 * Servlet implementation class BloodbankReadServlet
 */
public class BloodbankReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BloodBanksService bloodBanksService = new BloodBanksService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BloodbankReadServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		String searchBy = request.getParameter("searchBy");

		List<BloodBanks> banks = new ArrayList<>();

		if (searchBy.equalsIgnoreCase("city")) {
			String city = request.getParameter("city");
			banks = bloodBanksService.findAllByCity(city);
			request.setAttribute("banks", banks);
		}
		else if (searchBy.equalsIgnoreCase("bloodGroup")) {
			String bloodGroup = request.getParameter("bloodGroup");
			banks = bloodBanksService.findAllByBloodGroup(bloodGroup);
			request.setAttribute("banks", banks);
			
		}
		else if (searchBy.equalsIgnoreCase("all")) {
			banks = bloodBanksService.findAll();
			request.setAttribute("banks", banks);
			
		}
		request.getRequestDispatcher("/JSP/viewBloodBank.jsp").forward(request, response);
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
