package org.lessons.java;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private float iva = 22;
	
	
	
	
	
	public Prodotto(String nome, String marca, float prezzo) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		Random r=new Random();
		this.codice=r.nextInt(100)+1;
	}


	public int getCodice() {
		return codice;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public float getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(float prezzo) throws PriceException {
		if (prezzo<0)
			throw new PriceException(prezzo);
		else
			this.prezzo = prezzo;
	}


	public float getIva() {
		return iva;
	}


	public void setIva(float iva) {
		this.iva = iva;
	}
	
	public float getPrezzoTotale() {
		return prezzo*(1+(float)iva/100);
	}


	@Override
	public String toString() {
		return "Prodotto [codice=" + codice + ", nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + ", iva="
				+ iva + "]";
	}
	
	
	
}
