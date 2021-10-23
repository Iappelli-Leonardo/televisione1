package it.prova.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.prova.model.Televisione;


public class DB_Mock {
	public static final List<Televisione> LISTA_TELEVISIONI= new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISIONI.add(new Televisione(1l, "samsung", "sa11", 60, "dhsfe23"));
		LISTA_TELEVISIONI.add(new Televisione(2l, "panasonic", "pa22", 40, "sadads73"));
		LISTA_TELEVISIONI.add(new Televisione(3l, "akai", "ak33", 29, "sdan274"));
		LISTA_TELEVISIONI.add(new Televisione(4l, "philips", "ph44", 23, "asdnx22"));
		LISTA_TELEVISIONI.add(new Televisione(5l, "sony", "so55", 17, "bvjbd45"));
		LISTA_TELEVISIONI.add(new Televisione(6l, "huawei", "hu66", 39, "dckxhb875"));
		LISTA_TELEVISIONI.add(new Televisione(7l, "lg", "lg77", 77, "dfgd32s"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISIONI == null || LISTA_TELEVISIONI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISIONI.stream().max(Comparator.comparing(Televisione::getIdTelevisione)).get().getIdTelevisione();
		return ++resultId;
	}

}
