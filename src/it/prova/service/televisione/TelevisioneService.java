package it.prova.service.televisione;

import java.util.List;

import it.prova.dao.dao.TelevisioneDao;
import it.prova.model.Televisione;


public interface TelevisioneService {
	
	public void setTelevisioneDAO(TelevisioneDao televisioneDao);

	public List<Televisione> cercaPermarcaEModello(String marca, String modello);

	public Televisione caricaSingolo(Long id) throws Exception;

	public int inserisciNuovo(Televisione televisione) throws Exception;

	public List<Televisione> getAll() throws Exception;
	
	public int rimuoviElemento(Televisione televisione) throws Exception;
	
	public int modifica(Televisione televisione)throws Exception;
}
