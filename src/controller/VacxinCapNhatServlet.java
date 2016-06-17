package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.VacxinBO;
import model.dao.VacxinDAO;

/**
 * Servlet implementation class VacxinCapNhatServlet
 */
@SuppressWarnings("all")
public class VacxinCapNhatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VacxinCapNhatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("id")!=null){
			String maVacxin = request.getParameter("id");
			request.setAttribute("vacxin", new VacxinBO().getVacxin(maVacxin));
			RequestDispatcher rd = request.getRequestDispatcher("/admin/vacxin-cap-nhat.jsp");
			rd.forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/admin/danh-sach-vacxin");
		}
	}
}
