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


@WebServlet("/PrepareRimuoviServlet")
public class PrepareRimuoviServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrepareRimuoviServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String parametroIdDellTelevisioneDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");

			TelevisioneService televisioneServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();

			String destinazione = null;
			Televisione result = null;
			try {
				result = televisioneServiceInstance
						.caricaSingolo(Long.parseLong(parametroIdDellTelevisioneDiCuiVoglioIlDettaglio));
				destinazione = "rimuovi.jsp";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			request.setAttribute("televisoreDaInviareAPaginaDettaglio", result);

		
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

	

}
