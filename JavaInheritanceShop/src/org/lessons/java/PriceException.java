package org.lessons.java;

public class PriceException extends Exception {
	private float price;

	public PriceException(float price) {
		super("Prezzo non valido!");
		this.price = price;
	}
	
	public float getPrice() {
		return price;
	}
	
}
