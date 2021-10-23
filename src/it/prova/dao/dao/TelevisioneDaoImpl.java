package it.prova.dao.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import it.prova.dao.DB_Mock;
import it.prova.model.Televisione;

public class TelevisioneDaoImpl implements TelevisioneDao {

	private Connection connection;

	@Override
	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	@Override
	public List<Televisione> list() throws Exception {
		return DB_Mock.LISTA_TELEVISIONI;
	}

	@Override
	public Televisione get(Long id) throws Exception {
		Televisione result = new Televisione();

		for (Televisione abitanteItem : DB_Mock.LISTA_TELEVISIONI) {
			if (abitanteItem.getIdTelevisione() == id) {
				result = abitanteItem;
				return result;
			}
		}
		return null;
	}

	@Override
	public int update(Televisione input) throws Exception {
		for (Televisione abitanteItem : DB_Mock.LISTA_TELEVISIONI) {
			if (input.getIdTelevisione() == abitanteItem.getIdTelevisione()) {
				abitanteItem.setMarca(input.getMarca());
				abitanteItem.setModello(input.getModello());
				abitanteItem.setPrezzo(input.getPrezzo());
				abitanteItem.setNumeroSeriale(input.getNumeroSeriale());
				return 1;
			}
		}
		return 0;
	}

	@Override
	public int insert(Televisione input) throws Exception {
		input.setIdTelevisione(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISIONI.add(input)?1:0;
	}

	@Override
	public int delete(Televisione input) throws Exception {
		return DB_Mock.LISTA_TELEVISIONI.remove(input)?1:0;
	}

	@Override
	public List<Televisione> findByMarcaAndModello(String marca, String modello) {
		List<Televisione> result = new ArrayList<>();
		for (Televisione abitanteItem : DB_Mock.LISTA_TELEVISIONI) {
			if (abitanteItem.getMarca().startsWith(marca) && abitanteItem.getModello().startsWith(modello))
				result.add(abitanteItem);
		}
		return result;
	}

}
