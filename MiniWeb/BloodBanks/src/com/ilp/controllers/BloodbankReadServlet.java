package com.ilp.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ilp.beans.BloodBanks;
import com.ilp.dal.BloodBanksDao;

/**
 * Servlet implementation class BloodbankReadServlet
 */
public class BloodbankReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String action = request.getServletPath();
		try {
			switch (action) {
			case "/register":
				showNewForm(request, response);
				break;
			case "/update":
				update(request, response);
				break;
			case "/delete":
				delete(request, response);
				break;
			case "/searchByCity":
				FindAllByCity(request, response);
				break;
			case "/searchByBloodGroup":
				findAllByBloodgroup(request, response);
				break;
			default:
				findAll(request, response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	
	private void findAll(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		ArrayList<BloodBanks> Bloodbanks = BloodBanksDAO.findAll();
		request.setAttribute("findAll", findAll);
		RequestDispatcher dispatcher = request.getRequestDispatcher("Bloodbankslist.jsp");
		dispatcher.forward(request, response); }

	private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
	RequestDispatcher dispatcher = request.getRequestDispatcher("registartion.jsp");
	dispatcher.forward(request, response); }

	private void update(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("Id"));
		String Name = request.getParameter("bname");
		String Gender = request.getParameter("gender");
		int Number = Integer.parseInt(request.getParameter("contact"));
		String Bloodgroup = request.getParameter("BloodGroup");
		String City = request.getParameter("city");
		BloodBanks banks = new BloodBanks(id, Name, Gender, Number, Bloodgroup, City);
		BloodBanksDAO.update(banks);
		response.sendRedirect("list");
	}
	private void delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("Id"));
		BloodBanks banks = new BloodBanks(id);
		BloodBanksDAO.delete(banks);
		response.sendRedirect("list");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
