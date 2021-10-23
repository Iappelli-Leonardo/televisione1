package it.prova.service;

import it.prova.dao.MyDaoFactory;
import it.prova.service.televisione.TelevisioneService;
import it.prova.service.televisione.TelevisioneServiceImpl;

public class MyServiceFactory {
	// rendiamo questo factory SINGLETON
	private static TelevisioneService TELEVISIONE_SERVICE_INSTANCE;

	public static TelevisioneService getTelevisoreServiceInstance() {
		if (TELEVISIONE_SERVICE_INSTANCE == null)
			TELEVISIONE_SERVICE_INSTANCE = new TelevisioneServiceImpl();

		TELEVISIONE_SERVICE_INSTANCE.setTelevisioneDAO(MyDaoFactory.getTelevisioneDAOInstance());

		return TELEVISIONE_SERVICE_INSTANCE;
	}
}
