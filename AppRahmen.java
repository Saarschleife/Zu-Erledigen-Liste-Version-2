package zuErledigenListeV2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class AppRahmen extends JFrame{
	//Klassenvariablen	
	private TitelLeiste titel; 
	private Liste liste;
	private SchaltflaechenFeld schaltflaechen;
	
	private JButton aufgabeHinzu;
	private JButton listeLoeschen;
	
	//Konstruktor
	public AppRahmen() {
		
		setSize(400, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Objekte der anderen Klassen erzeugen	
		titel = new TitelLeiste(); 
		liste = new Liste();
		schaltflaechen = new SchaltflaechenFeld();
		
		//Schaltflächen mit Methoden aus Klasse Schaltflaechenfeld verbinden
		aufgabeHinzu = schaltflaechen.getNeueAufgabe();
		listeLoeschen = schaltflaechen.getListeLoeschen();
		
		//Objekte der Klassen in Layout einfügen
		add(titel, BorderLayout.NORTH);
		add(liste, BorderLayout.CENTER);
		add(schaltflaechen, BorderLayout.SOUTH);
		
		mausLauscher();//Methode aufrufen
	}
	
	//Methode für die MouseListener
	public void mausLauscher() {
		//Schaltfläche mit MouseListener verbinden
		//MouseAdapter erlaubt es, nur die jeweils benötigten Methoden zu überschreiben
		aufgabeHinzu.addMouseListener( new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent klick) {//Maustaste gedrückt?
				Aufgabe aufgabe = new Aufgabe();//neues Objekt der Klasse Aufgabe

				liste.add(aufgabe);//Objekt der Klasse Aufgabe zum Objekt der Klasse Liste hinzufügen
				liste. nummernAufgabenListe();//Methode der Klasse Liste aufrufen
				revalidate();//aktualisieren

				//Objekt mit Methode der Klasse Aufgabe verbinden, MouseListener verbinden
				aufgabe.getAufgabeErledigt().addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent klick) {//Maustaste gedrückt?
						aufgabe.aufgabeStatusAendern();//Objekt ruft Methode auf
					}
				});
				
				listeLoeschen.addMouseListener( new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent klick) {//Maustaste gedrückt?
						liste.remove(aufgabe);//Objekte entfernen
						liste.nummernAufgabenListe();
						revalidate();
						repaint();
					}
				});
				
			}
		});
	}
}
