package dieGarage;

import java.util.ArrayList;
import java.util.List;


public class Parkhaus {

	private int anzahlDerParkplaetze;
	private int anzahlDerStockwerke;
	private List<Parkplatz> parkplaetze;


	public Parkhaus (int anzahlDerParkplaetze, int anzahlDerStockwerke) {
		this.anzahlDerStockwerke = anzahlDerStockwerke;
		this.anzahlDerParkplaetze = anzahlDerParkplaetze;
		parkplaetze = new ArrayList<>();

		//Initialieseiren der Parkplätze
		for (int stockwerk = 1; stockwerk <= this.anzahlDerStockwerke; stockwerk++) {
			for (int parkplatz = 1; parkplatz <= this.anzahlDerParkplaetze; parkplatz++) {
				parkplaetze.add(new Parkplatz(parkplatz, stockwerk));
			}
		}
	}


	//Parkt das Fahrzeug ein
	//Parameter: Fahrzeug(String kennzeiche, ENUM fahrzeugTyp (AUTO, MOTORRAD))
	public Parkplatz autoEinparken (Fahrzeug fahrzeug) {
		for (Parkplatz parkplatz : parkplaetze) {
			if (!parkplatz.isIstBesetzt()) {
				parkplatz.parkplatzBesetzten(fahrzeug);
				System.out.println("Fahrzeug geparkt!");
				fahrzeugFinden(fahrzeug.getKennzeichen());
				return parkplatz;
			}
		}
		System.out.println("Leider kein Parkplatzfrei");
		return null;
	}


	//Park das Fahrzug aus
	//Parameter: Fahrzeug(String kennzeiche, ENUM fahrzeugTyp (AUTO, MOTORRAD))
	public void autoAusparken (Fahrzeug fahrzeug) {
		//durchsucht die Parkplätze nach Fahrzeug mit den Kennzeichen
		for (Parkplatz parkplatz : parkplaetze) {
			if (parkplatz.isIstBesetzt() && parkplatz.getGeparktesFahrzeug().getKennzeichen().equals(fahrzeug.getKennzeichen())) {
				parkplatz.parkplatzFreigeben();
				System.out.println("Das Fahrzeug mit den Kennzeichen " + fahrzeug.getKennzeichen() + " wurde ausgeparkt.");
			}
		}
	}


	//Gibt die Infos vom Parkhaus: anzahl Parkplätze, Freieplätze
	public void parkplatzInfo () {
		System.out.println("Parkplätze: " + parkplaetze.size());
		freieParkplaetze();
	}


	//Gibt aus wieviel freie Parkplätze vorhanden sind
	public void freieParkplaetze () {
		int counter = 0;
		for (Parkplatz parkplatz : parkplaetze) {
			if (!parkplatz.isIstBesetzt()) {
				counter++;
			}
		}
		System.out.println("Freieplätze: " + counter);
	}


	//Gibt aus wo das Fahrzeug mit den angegeben Kennzeichen geparkt ist
	//Parameter: String kennzeichen
	public void fahrzeugFinden (String kennzeichen) {
		for (Parkplatz parkplatz : parkplaetze) {
			if (parkplatz.getGeparktesFahrzeug() != null && parkplatz.getGeparktesFahrzeug().getKennzeichen().equals(kennzeichen)) {
				System.out.println("Das Fahrzeug mit den Kennzeichen >" + kennzeichen + "< befindet sich auf dem Stockwerk " + parkplatz.getStockwerkNr() + ", Parkplatz " + parkplatz.getParkplatzNr());
			}
		}
	}

}
