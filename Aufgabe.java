package zuErledigenListeV2;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aufgabe extends JPanel{
	//Klassenvariablen		
	private JLabel aufgabeNr;
	private JTextField aufgabeText;
	private JButton aufgabeErledigt;
	private boolean geprueft;

	//Konstruktor
	public Aufgabe () {

		setPreferredSize(new Dimension(400, 20));
		setLayout(new BorderLayout());

		geprueft = false;

		aufgabeNr = new JLabel("");
		aufgabeNr.setBorder(BorderFactory.createEmptyBorder());
		aufgabeNr.setPreferredSize(new Dimension(20, 20));
		aufgabeNr.setHorizontalAlignment(JLabel.CENTER);

		aufgabeText = new JTextField("Aufgabe eintragen");
		aufgabeText.setBorder(BorderFactory.createEmptyBorder());
		aufgabeText.setBackground(Color.PINK);

		aufgabeErledigt = new JButton("erledigt");
		aufgabeErledigt.setBorder(BorderFactory.createEmptyBorder());
		aufgabeErledigt.setPreferredSize(new Dimension(50, 20));

		add(aufgabeNr, BorderLayout.WEST);
		add(aufgabeText, BorderLayout.CENTER);
		add(aufgabeErledigt, BorderLayout.EAST);
	}

	//Methode gibt Schaltfläche zurück
	public JButton getAufgabeErledigt() {
		return aufgabeErledigt;
	}

	//Methode setzt Nummern der Aufgaben
	public void aufgabeNummer(int nummer) {
		aufgabeNr.setText(nummer + "");
	}

	//Methode ändert Farbe des Aufgabenfeldes, wenn Aufgabe erledigt ist
	public void aufgabeStatusAendern() {
		aufgabeText.setBackground(Color.GREEN);
		geprueft = true;
	}
}
