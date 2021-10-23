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


@WebServlet("/ExecuteInsertServlet")
public class ExecuteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ExecuteInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destinazione = null;

		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");
		String prezzoDaPagina = request.getParameter("prezzoInput");
		String codiceDaPagina = request.getParameter("codiceInput");

		if (marcaDaPagina.equals("") || modelloDaPagina.equals("") ||
				prezzoDaPagina.equals("") || codiceDaPagina.equals("")) {
			String messaggioDaInviareAPagina = "Attenzione! E' necessario valorizzare tutti i campi.";
			request.setAttribute("messaggioDiErrore", messaggioDaInviareAPagina);
			destinazione = "inserisci.jsp";
		} else {

			try {
				int prezzo = Integer.parseInt(prezzoDaPagina);
				Televisione abitanteDaPagina = new Televisione(marcaDaPagina, modelloDaPagina, prezzo, codiceDaPagina);

				MyServiceFactory.getTelevisoreServiceInstance().inserisciNuovo(abitanteDaPagina);

				request.setAttribute("listTelevisoriAttributeName",
						MyServiceFactory.getTelevisoreServiceInstance().getAll());

				destinazione = "risultati.jsp";
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
	}

}
