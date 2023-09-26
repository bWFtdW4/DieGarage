package dieGarage;

import java.util.ArrayList;
import java.util.List;


public class Fahrzeug {

	private String kennzeichen;
	private FahrzeugTyp fahrzeugTyp;
	private static List<String> kennzeichenListe = new ArrayList<>();


	enum FahrzeugTyp {
		AUTO, MOTORRAD
	}


	public Fahrzeug (String kennzeichen, FahrzeugTyp fahrzeugTyp) {
		//Überprüfung ob ein Fahrzeug mit den Kennzeichen schon existiert
		if (kennzeichenListe.contains(kennzeichen)) {
			System.out.println("Es exesistiert bereits ein Fahrzeug mit den Kennzeichn: " + kennzeichen);
		}
		this.kennzeichen = kennzeichen;
		this.fahrzeugTyp = fahrzeugTyp;
		kennzeichenListe.add(kennzeichen);
	}


	//gibt den Kennzeichen zurück
	public String getKennzeichen () {
		return kennzeichen;
	}


	//Gibt Fahrzeugtyp zurück
	public FahrzeugTyp getFahrzeugTyp () {
		return fahrzeugTyp;
	}

}
