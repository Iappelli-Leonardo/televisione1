package it.prova.model;

public class Televisione {

	private Long idTelevisione;
	private String marca;
	private String modello;
	private int prezzo;
	private String numeroSeriale;

	public Televisione() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Televisione(Long idTelevisione, String marca, String modello, int prezzo, String numeroSeriale) {
		super();
		this.idTelevisione = idTelevisione;
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroSeriale = numeroSeriale;
	}

	public Televisione(String marca, String modello, int prezzo, String numeroSeriale) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzo = prezzo;
		this.numeroSeriale = numeroSeriale;
	}

	public Long getIdTelevisione() {
		return idTelevisione;
	}

	public void setIdTelevisione(Long idTelevisione) {
		this.idTelevisione = idTelevisione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	public String getNumeroSeriale() {
		return numeroSeriale;
	}

	public void setNumeroSeriale(String numeroSeriale) {
		this.numeroSeriale = numeroSeriale;
	}

	@Override
	public String toString() {
		return "Televisione [idTelevisione=" + idTelevisione + ", marca=" + marca + ", modello=" + modello + ", prezzo="
				+ prezzo + ", numeroSeriale=" + numeroSeriale + "]";
	}

}
