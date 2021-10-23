package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.service.MyServiceFactory;
import it.prova.service.televisione.TelevisioneService;

@WebServlet("/ExecuteRimuoviServlet")
public class ExecuteRimuoviServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public ExecuteRimuoviServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		Long idTelevisione = Long.parseLong(request.getParameter("idTelevisore"));
		
		TelevisioneService televisioneServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		try {
			televisioneServiceInstance.rimuoviElemento(televisioneServiceInstance.caricaSingolo(idTelevisione));
			
			request.setAttribute("listTelevisoriAttributeName", televisioneServiceInstance.getAll());
			RequestDispatcher rd = request.getRequestDispatcher("risultati.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
