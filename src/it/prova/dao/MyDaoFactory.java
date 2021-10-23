package it.prova.dao;

import it.prova.dao.dao.TelevisioneDao;
import it.prova.dao.dao.TelevisioneDaoImpl;

public class MyDaoFactory {

	private static TelevisioneDao TELEVISIONE_DAO_INSTANCE = null;

	public static TelevisioneDao getTelevisioneDAOInstance() {
		if (TELEVISIONE_DAO_INSTANCE == null)
			TELEVISIONE_DAO_INSTANCE = new TelevisioneDaoImpl();

		return TELEVISIONE_DAO_INSTANCE;
	}

}
