package it.prova.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.model.Televisione;
import it.prova.service.MyServiceFactory;
import it.prova.service.televisione.TelevisioneService;


@WebServlet("/PrepareModificaServlet")
public class PrepareModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PrepareModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametroIdDellAbitanteDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");

		TelevisioneService televisioneServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

		Televisione result = null;
		String destinazione = "modifica.jsp";
		try {
			result = televisioneServiceInstance
					.caricaSingolo(Long.parseLong(parametroIdDellAbitanteDiCuiVoglioIlDettaglio));
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("abitanteDaInviareAPaginaDettalio", result);

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
