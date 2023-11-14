package scuola;

import java.util.Scanner;
import java.lang.Math;
import java.util.Math;

public class calcolatrice {

	public static void main(String[] args) {
		//Inizializzazione dello Scanner
		Scanner src = new Scanner(System.in);
		
		//Dichiarazione variabili
		byte scelta, n;
		double risultato;
		
		//Richiesta dell'operazione
		System.out.println("Scegli che operazione eseguire sapendo che:");
		System.out.println("0 - Per eseguire un addizione.");
		System.out.println("1 - Per eseguire una sottrazione.");
		System.out.println("2 - Per eseguire una moltiplicazione.");
		System.out.println("3 - Per eseguire una divisione.");
		System.out.println("4 - Per eseguire una potenza.");
		System.out.println("5 - Per eseguire una radice quadrata.");
		System.out.println("6 - Per eseguire una percentuale.");
		System.out.print("Scegli: ");
		scelta = src.nextByte();
		
		//Creazione del menu
		switch(scelta) {
		    
		    //0 - Addizione
		    case 0:
		    	risultato = 0;
		    	System.out.print("Inserisci la quantità di numeri da sommare: ");
		    	n = src.nextByte();
		    	double[] numeri = new double[100];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri[i] = src.nextDouble();
		    	}
		    	for (byte j = 0; j < numeri.length; j++) {
		    		risultato += numeri[j];
		    	}
		    	System.out.println("Il risultato è: " + risultato);
		    	break;
		    	
		    //1 - Sottrazione
		    case 1:
		    	System.out.print("Inserisci la quantità di numeri da sottrarre: ");
		    	n = src.nextByte();
		    	double[] numeri2 = new double[100];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri2[i] = src.nextDouble();
		    	}
		    	risultato = numeri2[0];    			//Questo serve a far funzionare la sottrazione
		    	for (byte j = 1; j < numeri2.length; j++) {
		    		risultato -= numeri2[j];
		    	}
		    	System.out.println("Il risultato è: " + risultato);
		    	break;
		    	
		    //2 - Moltiplicazione
		    case 2:
		    	risultato = 1;				//Stavolta 1 perché moltiplicare per 0 da sempre 0
		    	System.out.print("Inserisci la quantità di numeri da moltiplicare: ");
		    	n = src.nextByte();
		    	double[] numeri3 = new double[100];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri3[i] = src.nextDouble();
		    	}
		    	for (byte j = 0; j < numeri3.length; j++) {
		    		risultato = risultato * numeri3[j];
		    	}
		    	System.out.println("Il risultato è: " + risultato);
		    	break;
		    	
		    //3 - Divisione
		    case 3: 
		    	System.out.print("Inserisci la quantità di numeri da dividere: ");
		    	n = src.nextByte();
		    	double[] numeri4 = new double[100];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri4[i] = src.nextDouble();
		    	}
		    	risultato = numeri4[0];
		    	for (byte j = 1; j < numeri4.length; j++) {
		    		risultato = risultato / numeri4[j];
		    	}
		    	System.out.println("Il risultato è: " + risultato);
		    	break;
		}
	}
}
