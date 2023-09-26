package dieGarage;

public class Parkplatz {

	private int parkplatzNr;
	private int stockwerkNr;
	private Fahrzeug geparktesFahrzeug;
	private boolean istBesetzt;


	public Parkplatz (int parkplatzNr, int stockwerkNr) {
		this.parkplatzNr = parkplatzNr;
		this.stockwerkNr = stockwerkNr;
	}


	//Gibt Parkplatznummer zurück
	public int getParkplatzNr () {
		return parkplatzNr;
	}


	//Gibt den Stockwerknummer 
	public int getStockwerkNr () {
		return stockwerkNr;
	}


	//Gibt Fahrzeuginfo des geparkten Fahrzeugs zurück (kennzeichen, fahrzeugTyp)
	public Fahrzeug getGeparktesFahrzeug () {
		return geparktesFahrzeug;
	}


	//Gibt true/false zurück wenn Parkplatz besetzt
	public boolean isIstBesetzt () {
		return istBesetzt;
	}


	//Setzt Parkplatz als Besetzt und weist Fahrzeug details zu
	//Parameter: Fahrzeug(String kennzeiche, ENUM fahrzeugTyp (AUTO, MOTORRAD))
	public void parkplatzBesetzten (Fahrzeug fahrzeug) {
		geparktesFahrzeug = fahrzeug;
		istBesetzt = true;
	}


	//Gibt Parkplatz wieder frei
	public void parkplatzFreigeben () {
		geparktesFahrzeug = null;
		istBesetzt = false;
	}

}
