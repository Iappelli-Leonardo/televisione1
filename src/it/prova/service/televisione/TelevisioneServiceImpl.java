package it.prova.service.televisione;

import java.util.List;

import it.prova.dao.dao.TelevisioneDao;
import it.prova.model.Televisione;

public class TelevisioneServiceImpl implements TelevisioneService {

	private TelevisioneDao televisioneDao;

	@Override
	public void setTelevisioneDAO(TelevisioneDao televisioneDao) {
		this.televisioneDao = televisioneDao;
	}

	@Override
	public List<Televisione> cercaPermarcaEModello(String marca, String modello) {
		return televisioneDao.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisione caricaSingolo(Long id) throws Exception {
		return televisioneDao.get(id);
	}

	@Override
	public int inserisciNuovo(Televisione televisione) throws Exception {
		return televisioneDao.insert(televisione);
	}

	@Override
	public List<Televisione> getAll() throws Exception {
		return televisioneDao.list();
	}

	@Override
	public int rimuoviElemento(Televisione televisione) throws Exception {
		return televisioneDao.delete(televisione);
	}

	@Override
	public int modifica(Televisione televisione) throws Exception {
		return televisioneDao.update(televisione);
	}

}
