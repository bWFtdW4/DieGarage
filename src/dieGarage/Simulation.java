package dieGarage;

import dieGarage.Fahrzeug.FahrzeugTyp;

/*
 * Die Garage
 * für 360 Consulting,
 * von Mamun Anjum
 */
public class Simulation {

	public static void main (String[] args) {

		//Parkplatz initialisieren 
		//parameter: int anzahlDerParkplaetze = Anzahl der verfügbaren Plätze. Muss > 0 sein.
		//parameter: int anzahlDerStockwerke = Anzahl der Stockwerke für Parkplätze. Muss größer 0 sein.
		Parkhaus parkhaus1 = new Parkhaus(3, 1);

		//ein Fahrzeug initialisieren 
		//parameter: String kennzeichen 
		//parameter: ENUM fahrzeugTyp (AUTO, MOTORRAD)
		Fahrzeug fahrzeug1 = new Fahrzeug("fahrzeug3", FahrzeugTyp.AUTO);
		Fahrzeug fahrzeug2 = new Fahrzeug("fahrzeug2", FahrzeugTyp.MOTORRAD);
		Fahrzeug fahrzeug3 = new Fahrzeug("fahrzeug3", FahrzeugTyp.AUTO);
		Fahrzeug fahrzeug4 = new Fahrzeug("fahrzeug4", FahrzeugTyp.MOTORRAD);
		Fahrzeug fahrzeug5 = new Fahrzeug("fahrzeug5", FahrzeugTyp.MOTORRAD);
		Fahrzeug fahrzeug6 = new Fahrzeug("fahrzeug6", FahrzeugTyp.MOTORRAD);

		//Das Fahrzeug wird im Parkhaus geparkt.
		parkhaus1.autoEinparken(fahrzeug3);
		parkhaus1.autoEinparken(fahrzeug2);
		
		parkhaus1.parkplatzInfo();

		parkhaus1.autoEinparken(fahrzeug4);
		parkhaus1.autoEinparken(fahrzeug5);
		parkhaus1.autoEinparken(fahrzeug6);
		
		//Das Fahrzeug mit den Kennzeichen finden
		parkhaus1.fahrzeugFinden("fahrzeug6");
		parkhaus1.parkplatzInfo();

		parkhaus1.autoAusparken(fahrzeug1);
		parkhaus1.autoAusparken(fahrzeug2);
		parkhaus1.autoAusparken(fahrzeug4);
		parkhaus1.autoAusparken(fahrzeug5);
		parkhaus1.parkplatzInfo();
	}
}
