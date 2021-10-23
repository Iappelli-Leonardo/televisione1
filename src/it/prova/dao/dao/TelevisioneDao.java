package it.prova.dao.dao;

import java.sql.Connection;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.Televisione;

public interface TelevisioneDao extends IBaseDAO<Televisione>{
	public void setConnection(Connection connection);

	public List<Televisione> findByMarcaAndModello(String marca, String modello);
}
