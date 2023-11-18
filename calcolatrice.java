package scuola;

import java.util.Scanner;
import java.lang.Math;

public class calcolatrice {
	
	static boolean is_integer(double num) {
		int num1 = (int) num;
		
		if ((num - num1) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		System.out.println("Scegli che operazione eseguire sapendo che:");
		System.out.println("0 - Per eseguire un addizione.");
		System.out.println("1 - Per eseguire una sottrazione.");
		System.out.println("2 - Per eseguire una moltiplicazione.");
		System.out.println("3 - Per eseguire una divisione.");
		System.out.println("4 - Per eseguire una potenza.");
		System.out.println("5 - Per eseguire una radice quadrata.");
		System.out.println("6 - Per eseguire una percentuale.");
		System.out.print("Scegli: ");
		byte scelta = -1;
		try { 
			scelta = src.nextByte();
		} catch (Exception e) {
			System.out.println("Devi inserire un numero, non caratteri, simboli o parole/frasi.");
		}
		
		switch(scelta) {
		    
		    case 0:
		    	double risultato = 0;
		    	System.out.print("Inserisci la quantità di numeri da sommare: ");
		    	byte n = src.nextByte();
		    	double[] numeri = new double[n];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri[i] = src.nextDouble();
		    	}
		    	for (byte j = 0; j < n; j++) {
		    		risultato += numeri[j];
		    	}
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    	
		    case 1:
		    	System.out.print("Inserisci la quantità di numeri da sottrarre: ");
		    	n = src.nextByte();
		    	double[] numeri2 = new double[n];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri2[i] = src.nextDouble();
		    	}
		    	risultato = numeri2[0];    			//Questo serve a far funzionare la sottrazione
		    	for (byte j = 1; j < n; j++) {
		    		risultato -= numeri2[j];
		    	}
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    	
		    case 2:
		    	risultato = 1;				//Stavolta 1 perché moltiplicare per 0 da sempre 0
		    	System.out.print("Inserisci la quantità di numeri da moltiplicare: ");
		    	n = src.nextByte();
		    	double[] numeri3 = new double[n];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri3[i] = src.nextDouble();
		    	}
		    	for (byte j = 0; j < n; j++) {
		    		risultato = risultato * numeri3[j];
		    	}
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    	
		    case 3: 
		    	System.out.print("Inserisci la quantità di numeri da dividere: ");
		    	n = src.nextByte();
		    	double[] numeri4 = new double[n];
		    	for (byte i = 0; i < n; i++) {
		    		System.out.print("Inserisci numero: ");
		    		numeri4[i] = src.nextDouble();
		    	}
		    	risultato = numeri4[0];		//Il primo numero della divisione deve essere messo così
		    	for (byte j = 1; j < n; j++) {
		    		risultato = risultato / numeri4[j];
		    	}
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    
		    case 4:
		    	System.out.print("Inserisci la base: ");
		    	short base = src.nextShort();
		    	System.out.print("Inserisci l'esponente: ");
		    	byte esponente = src.nextByte();
		    	risultato = Math.pow(base, esponente);
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    	
		    case 5: 
		    	System.out.print("Inserisci il radicando (numero sotto la radice): ");
		    	short radicando = src.nextShort();
		    	risultato = Math.sqrt(radicando);
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    	
		    case 6:
		    	System.out.print("Inserisci il numero: ");
		    	double numeropercentuale = src.nextDouble();
		    	System.out.print("Inserisci la percentuale che ne vuoi calcolare: ");
		    	short percentuale = src.nextShort();
		    	risultato = (numeropercentuale * percentuale) / 100;
		    	if (is_integer(risultato)) {
		    		int risultato_int = (int) risultato;
		    		System.out.println("Il risultato è: " + risultato_int);
		    	} else {
		    		System.out.println("Il risultato è: " + risultato);
		    	}
		    	break;
		    	
		    default:
		    	System.out.println("Devi scegliere una tra quelle 6 opzioni.");
		}
		
		System.out.println("Fine del programma.");
		
		//Nini :)
	}
}
