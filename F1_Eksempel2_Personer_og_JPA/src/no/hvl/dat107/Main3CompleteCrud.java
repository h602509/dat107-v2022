package no.hvl.dat107;

import java.util.List;

public class Main3CompleteCrud {
	
	private static Databasehjelper dbhjelper = new Databasehjelper();
	
	public static void main(String[] args) {

		/* Eksempeldatabasen vår ser slik ut:
		 *  
		 * id		navn
		 * ----------------------
		 * 1001	'Per Viskeler'
		 * 1002	'Atle Patle'
		 * 1003	'Donald Duck'
		 */
		skrivUt("Utgangspunkt");
		
		//Create - Opprette ny(e) rad(er) i databasen
		dbhjelper.createPerson(new Person(1004, "Mikke"));
		skrivUt("Har lagt til Mikke");
		
		//Read - Hente ut data fra databasen
		//Hopper over denne
		
		//Update - Oppdatere data i databasen
		dbhjelper.updatePerson(1004, "Mikke Mus");
		skrivUt("Har endret navn til Mikke Mus");
		
		//Delete - Slette rad(er) fra databasen
		dbhjelper.deletePerson(new Person(1001, null));
		skrivUt("Har slettet person med id 1001");
		
		//Tilbakestille til utgangspunkt
		dbhjelper.createPerson(new Person(1001, "Per Viskeler"));
		dbhjelper.deletePerson(new Person(1004, null));
		skrivUt("Har tilbakestilt db");
	}

	private static void skrivUt(String tekst) {
		List<Person> personer = dbhjelper.retrieveAllePersoner();
		System.out.println("\n--- "+ tekst +" ---");
		personer.forEach(System.out::println);		
	}

}
