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


@WebServlet("/DettagliServlet")
public class DettagliServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public DettagliServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String parametroIdTelevisioneDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");

		TelevisioneService abitanteServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

		String destinazione = null;
		Televisione result = null;
		try {
			result = abitanteServiceInstance
					.caricaSingolo(Long.parseLong(parametroIdTelevisioneDiCuiVoglioIlDettaglio));
			destinazione = "dettagli.jsp";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("televisioneDaInviareAPaginaDettalio", result);

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);

	}
	
}
