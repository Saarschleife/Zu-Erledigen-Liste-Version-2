package zuErledigenListeV2;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Liste extends JPanel{

	Border rahmenAußen = BorderFactory.createRaisedSoftBevelBorder();
	
	//Konstruktor
	public Liste () {
		GridLayout listenLayout = new GridLayout(10, 1);//Layout für 10 Zeilen u. eine Spalte
		listenLayout.setVgap(5);//vertikaler Abstand
				
		setLayout(listenLayout);
		setBackground(Color.LIGHT_GRAY);
		setBorder(rahmenAußen);
	}
	
	//Methode nummeriert die Aufgaben
	public void nummernAufgabenListe() {
		Component[] listenDinge = this.getComponents();//Array für Anzahl der Dinge in Aufgabenliste
		
		for (int listenAnzahl = 0; listenAnzahl < listenDinge.length; listenAnzahl++) {
			if (listenDinge[listenAnzahl] instanceof Aufgabe) {//ist Component Objekt von Klasse Aufgabe?
				((Aufgabe)listenDinge[listenAnzahl]).aufgabeNummer(listenAnzahl+1);//Component um 1 erhöhen
			}
		}
	}
		
}
