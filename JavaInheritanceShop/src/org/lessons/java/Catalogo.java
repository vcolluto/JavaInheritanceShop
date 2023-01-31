package org.lessons.java;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int tipologia=-1, numeroProdotti=0;
		String nome, marca;
		float prezzo, totale=0;
		Prodotto p;
		System.out.println("Scegli la tipologia del prodotto da inserire (1-Smartphone; 2-Televisone; 3-Cuffie) : ");

		do {
			try {
				tipologia=Integer.parseInt(s.nextLine());
				if (tipologia<1||tipologia>3)
					System.out.println("Tipologia non valida. Ripetere l'inserimento");

			} catch (Exception e) {
				System.out.println("Tipologia non valida. Ripetere l'inserimento");

			}
		} while(tipologia<1||tipologia>3);



		System.out.print("Inserisci il nome del prodotto: ");
		nome = s.nextLine();
		System.out.print("Inserisci la marca del prodotto: ");
		marca = s.nextLine();
		System.out.print("Inserisci il prezzo del prodotto: ");
		
		try {
			prezzo = Float.parseFloat(s.nextLine());
			
			if (prezzo<0)
				throw new PriceException(prezzo);


			switch(tipologia) {
			case 1:	//smartphone
			{
				String imei;
				int giga;

				System.out.print("Inserisci l'IMEI: ");
				imei = s.nextLine();
				System.out.print("Inserisci la quantità di memoria (GB): ");
				giga = Integer.parseInt(s.nextLine());
				p=new Smartphone(nome, marca, prezzo, imei, giga);
				p.setPrezzo(65);
				System.out.println("Hai inserito: "+p.toString());

				break;

			} 
			}

		}
		catch (NumberFormatException e) {
			System.out.println("Il formato del numero non è valido: "+e.getMessage());
			return;
		}
		catch (PriceException e) {
			System.out.println("Si è verificato un errore sul prezzo: "+e.getMessage());
			if (e.getPrice()<0)
				System.out.println("Non è consentito un prezzo negativo!");
			return;
		}
		catch (Exception e) {
			System.out.println("Si è verificato un errore: "+e.getMessage());
			return;
		}
		finally {
			System.out.println("Chiudo lo scanner");
			s.close();
		}


		

	}

}
