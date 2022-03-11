package no.hvl.dat107;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static void pauseOgSjekkDatabasen(String prompt) {
		System.out.println("\n" + prompt);
		System.out.println("Trykk \"ENTER\" for å fortsette ...");
		scanner.nextLine();
	}
	
	public static void main(String[] args) {

		// 1, 'Handle mat'
		// 2, 'Vaske opp'
		// 3, 'Ta ut bosset'
		
		// Hjelpeklasse for å snakke med databasen
		// DAO er en forkortelse for Data Access Object, og er et vanlig navn på slike
		TodoDAO todoDAO = new TodoDAO();

		// a) Hente ut todo med pk=2 
		// b) Hente ut alle todos 
		// c.i)   Hente ut SINGLE todo med tekst="Handle mat" 
		// c.ii)  Hente ut SINGLE todo med tekst="Vaske bilen" (som ikke finnes) 
		// c.iii) Hente ut LISTE av todos med tekst="Handle mat" 
		// c.iv)  Hente ut LISTE av todos med tekst="Vaske bilen" (som ikke finnes) 
		// d) Legge til en ny todo med pk=4 
		// e) Slette todo med pk=4 
		// f) Endre tekst på todo med pk=3
		// g) Endre tekst på todo med pk=3, alternativ måte
		
	}
}
