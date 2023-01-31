package org.lessons.java;

public class Smartphone extends Prodotto {
	private String imei;
	private int quantitàMemoria; // in GigaByte
	
	
	public Smartphone(String nome, String marca, float prezzo, String imei, int quantitàMemoria) {
		super(nome, marca, prezzo);
		this.imei = imei;
		this.quantitàMemoria = quantitàMemoria;
	}


	public String getImei() {
		return imei;
	}


	public void setImei(String imei) {
		this.imei = imei;
	}


	public int getQuantitàMemoria() {
		return quantitàMemoria;
	}


	public void setQuantitàMemoria(int quantitàMemoria) {
		this.quantitàMemoria = quantitàMemoria;
	}


	@Override
	public String toString() {
		/*return "Smartphone [getCodice()=" + getCodice()
				+ ", getNome()=" + getNome() + ", getMarca()=" + getMarca() + ", getPrezzo()=" + getPrezzo() + 
				", imei=" + imei + ", quantitàMemoria=" + quantitàMemoria + ", ]";
	*/
		return super.toString()+", imei=" + imei + ", quantitàMemoria=" + quantitàMemoria + ", ]";
	}
	

	
	
	

}
